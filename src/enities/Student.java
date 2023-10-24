package enities;

import java.util.Calendar;

public class Student {
	private Integer idSudent;
	private String name;
	private Calendar birthday;
	private Subject intendedCourse;
	private String telefone;
	private String password;
	private String nameRelative;
	private String telefoneRelative;
	
	
	
	public Student() {
		
	}



	public Student(Integer idSudent, String name, Calendar birthday, Subject intendedCourse, String telefone,
			String password, String nameRelative, String telefoneRelative) {
		this.idSudent = idSudent;
		this.name = name;
		this.birthday = birthday;
		this.intendedCourse = intendedCourse;
		this.telefone = telefone;
		this.password = password;
		this.nameRelative = nameRelative;
		this.telefoneRelative = telefoneRelative;
	}



	public Integer getIdSudent() {
		return idSudent;
	}



	public void setIdSudent(Integer idSudent) {
		this.idSudent = idSudent;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Calendar getBirthday() {
		return birthday;
	}



	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}



	public Subject getIntendedCourse() {
		return intendedCourse;
	}



	public void setIntendedCourse(Subject intendedCourse) {
		this.intendedCourse = intendedCourse;
	}



	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getNameRelative() {
		return nameRelative;
	}



	public void setNameRelative(String nameRelative) {
		this.nameRelative = nameRelative;
	}



	public String getTelefoneRelative() {
		return telefoneRelative;
	}



	public void setTelefoneRelative(String telefoneRelative) {
		this.telefoneRelative = telefoneRelative;
	}
	
	
	
}
