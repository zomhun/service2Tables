package demo.entities.dto;

public class ClassesDTO {
	private String classId;
	private String className;
	public ClassesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClassesDTO(String classId, String className) {
		super();
		this.classId = classId;
		this.className = className;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
