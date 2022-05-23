package demo.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Classes")
public class Classes {
	@Id
	@Column(name = "ClassId")
	private String classId;
	@Column(name = "ClassName")
	private String className;
	
	@OneToMany(mappedBy = "classes")
	private Set<Student> students;

	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Classes(String classId, String className, Set<Student> students) {
		super();
		this.classId = classId;
		this.className = className;
		this.students = students;
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

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
	
}
