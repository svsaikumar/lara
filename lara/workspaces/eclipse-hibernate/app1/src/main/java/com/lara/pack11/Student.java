package com.lara.pack11;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student
{
	
	private int id;
	private String name;
	private int[] mobileNos;
	private String[] projects;
	private Collection skills;
	private List marks;//here we can go for all subtypes(ArrayList, LinkedList, Vector...)
	private Set jobs;
	private Map educations;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMobileNos() {
		return mobileNos;
	}
	public void setMobileNos(int[] mobileNos) {
		this.mobileNos = mobileNos;
	}
	public String[] getProjects() {
		return projects;
	}
	public void setProjects(String[] projects) {
		this.projects = projects;
	}
	public Collection getSkills() {
		return skills;
	}
	public void setSkills(Collection skills) {
		this.skills = skills;
	}
	public List getMarks() {
		return marks;
	}
	public void setMarks(List marks) {
		this.marks = marks;
	}
	public Set getJobs() {
		return jobs;
	}
	public void setJobs(Set jobs) {
		this.jobs = jobs;
	}
	public Map getEducations() {
		return educations;
	}
	public void setEducations(Map educations) {
		this.educations = educations;
	}

	
}
// <mapping resource="com/lara/pack11/Student.hbm.xml"/> -->
