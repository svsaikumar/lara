package com.lara.pack16;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import javax.persistence.Table;




@Entity
@Table(name="mails")
public class Mail 
{
	@Id
	private int id;
	private String username;
	private String password;
	
	@ManyToOne
	private Student student;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}	
}
//pack15 and pack16 errors 
