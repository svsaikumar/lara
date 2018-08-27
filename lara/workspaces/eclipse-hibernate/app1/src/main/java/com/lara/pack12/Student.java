package com.lara.pack12;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;


import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "student")
public class Student
{
	@Id
	private int id;
	
	private String name;
	
	@CollectionTable(name="mobile_numbers", joinColumns = @JoinColumn(name="S_ID"))
	@IndexColumn(name="sno")//index colimn
	@Column(name = "M_NUMBER")//element icolumn
	private int[] mobileNos;
	
	
	@ElementCollection
	@CollectionTable(name = "projects", joinColumns = @JoinColumn(name="S_ID"))//foreign column
	@IndexColumn(name="sno")
	@Column(name="P_NAME")
	
	private String[] projects;
	
	@ElementCollection
	@CollectionTable(name="marks", joinColumns = @JoinColumn(name="S_ID"))
	@IndexColumn(name= "sno")
	
	private List<Integer> marks;
	
	
	@ElementCollection //any collection or array we have to use @ElementCollection
	@CollectionTable(name="jobs", joinColumns = @JoinColumn(name="S_ID"))
	@Column(name = "job_name")
	private Set<String> jobs;
	

	@ElementCollection
	@CollectionTable(name="educations", joinColumns = @JoinColumn(name="S_ID"))
	@MapKeyColumn(name = "education_type")
	@Column(name = "education_name")
	private Map<String, String> educations;
	
	@ElementCollection
	@CollectionTable(name="skills", joinColumns = @JoinColumn(name="S_ID"))
	@Column(name = "SKILL_NAME")
	private Collection<String>skills;

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

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<String> getJobs() {
		return jobs;
	}

	public void setJobs(Set<String> jobs) {
		this.jobs = jobs;
	}

	public Map<String, String> getEducations() {
		return educations;
	}

	public void setEducations(Map<String, String> educations) {
		this.educations = educations;
	}

	public Collection<String> getSkills() {
		return skills;
	}

	public void setSkills(Collection<String> skills) {
		this.skills = skills;
	}
	
	
	
}

//<mapping class="com.lara.pack12.Student"/>
