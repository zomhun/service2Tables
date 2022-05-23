package demo.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

import demo.dao.impl.StudentDAOImpl;
import demo.entities.Classes;
import demo.entities.Student;
import demo.entities.dto.StudentDTO;

@Path("/student-service")
public class StudentService {
	@GET
	@Path("/listStudents")
	@Produces(MediaType.APPLICATION_JSON)
	public String getListStudents() {
		List<Student> listStudents = new StudentDAOImpl().getListStudents();
		
		List<StudentDTO> listDTO = new ArrayList<>();
		for (Student s : listStudents) {
			StudentDTO dto = new StudentDTO();
			dto.setStuId(s.getStuId());
			dto.setFullName(s.getFullName());
			dto.setGender(s.getGender());
			dto.setBirthday(s.getBirthday());
			dto.setAddress(s.getAddress());
			dto.setClassId(s.getClasses().getClassId());
			listDTO.add(dto);
		}
		
		Gson son = new Gson();
		String data = son.toJson(listDTO);
		return data;
	}
	
	@POST
	@Path("/insertStudent")
	@Consumes(MediaType.APPLICATION_JSON)
	public String insertStudent(String dtoJson) {
		Gson son = new Gson();
		StudentDTO dto = son.fromJson(dtoJson, StudentDTO.class);
		
		Student s = new Student();
		s.setFullName(dto.getFullName());
		s.setGender(dto.getGender());
		s.setBirthday(dto.getBirthday());
		s.setAddress(dto.getAddress());
		
		Classes objClass = new Classes();
		objClass.setClassId(dto.getClassId());
		s.setClasses(objClass);
		
		boolean bl = new StudentDAOImpl().insertStudent(s);
		String data = son.toJson(bl);
		return data;
	}
}
