package com.lara.pack17;

import java.util.HashSet;
import java.util.Set;

public class Batch 
{
	private int id;
	private String title;
	private int duration;
	private Set students = new HashSet();//one batch will have n number of students
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Set getStudents() {
		return students;
	}
	public void setStudents(Set students) {
		this.students = students;
	}
	public void addStudent(Student std)
	{
		students.add(std);
		std.getBatches().add(this);
	}
	
}
