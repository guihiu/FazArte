package enities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Class {
	private Integer idClass;
	private String nameClass;
	private Subject subject;
	private Calendar beginClass;
	private Calendar endClass;
	private Integer UserId;
	private List<Student>  students = new  ArrayList<>();
	
	public Class() {
	
	}
	public Class(Integer idClass, String nameClass, Subject subject, Calendar beginClass, Calendar endClass,
			Teacher teacher, List<Student> students) {
		this.idClass = idClass;
		this.nameClass = nameClass;
		this.subject = subject;
		this.beginClass = beginClass;
		this.endClass = endClass;
		UserId = teacher.getIdUser();
		this.students = students;
	}
	public Integer getIdClass() {
		return idClass;
	}
	public void setIdClass(Integer idClass) {
		this.idClass = idClass;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Calendar getBeginClass() {
		return beginClass;
	}
	public void setBeginClass(Calendar beginClass) {
		this.beginClass = beginClass;
	}
	public Calendar getEndClass() {
		return endClass;
	}
	public void setEndClass(Calendar endClass) {
		this.endClass = endClass;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId( Teacher teacher) {
		UserId = teacher.getIdUser();
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	
	
}
