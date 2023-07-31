package springmvc.controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Userd {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String studentname;
	private String gmail;
	private String password;
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	@Override
	public String toString() {
		return "Userd [studentname=" + studentname + ", gmail=" + gmail + ", password=" + password + "]";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Userd(String studentname, String gmail, String password) {
		super();
		this.studentname = studentname;
		this.gmail = gmail;
		this.password = password;
	}
	public Userd() {
		super();
		// TODO Auto-generated constructor stub
	}

}
