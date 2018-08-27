package com.lara.pack18;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.ManyToMany;

@Entity
@Table(name="BATCH")
public class Batch 
{
	
	@Id
	private int id;
	private String title;
	
	
	private int duration;
	@ManyToMany(mappedBy="batches")//total config of mamy to many is available in batches
	private Set<Student> students = new HashSet<Student>();
	
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
	
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public void addStudent(Student std)
	{
		students.add(std);
		std.getBatches().add(this);
	}
	
}
