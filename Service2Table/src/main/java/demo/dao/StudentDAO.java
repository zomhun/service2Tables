package demo.dao;

import java.util.List;

import demo.entities.Student;

public interface StudentDAO {
	public List<Student> getListStudents();
	public Student getStudentById(Integer stuId);
	public boolean insertStudent(Student stu);
	public boolean updateStudent(Student stu);
	public boolean deleteStudent(Integer stuId);
	public List<Student> getStudentsByName(String name);
}
