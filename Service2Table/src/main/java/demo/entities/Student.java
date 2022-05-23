package demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {
	@Id
	@Column(name = "StuId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stuId;
	@Column(name = "FullName")
	private String fullName;
	@Column(name = "Gender")
	private Boolean gender;
	@Column(name = "Birthday")
	private Date birthday;
	@Column(name = "Address")
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "ClassId", referencedColumnName = "ClassId")
	private Classes classes;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Integer stuId, String fullName, Boolean gender, Date birthday, String address, Classes classes) {
		super();
		this.stuId = stuId;
		this.fullName = fullName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.classes = classes;
	}

	public Integer getStuId() {
		return stuId;
	}

	public void setStuId(Integer stuId) {
		this.stuId = stuId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Boolean getGender() {
		return gender;
	}

	public void setGender(Boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}	
	
}
