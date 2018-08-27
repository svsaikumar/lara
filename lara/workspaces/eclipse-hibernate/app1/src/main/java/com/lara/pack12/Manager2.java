package com.lara.pack12;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import com.lara.Util;

public class Manager2 
{
	public static void main(String[] args) {
		
		Session session = Util.getSession();
		Criteria ctr = session.createCriteria(Student.class);
		List<Student> list = ctr.list();
		for(Student s1 : list)
		{
			System.out.println(s1.getId());
			System.out.println(s1.getName());
			System.out.println(s1.getEducations());
			System.out.println(s1.getJobs());
			System.out.println(s1.getMarks());
			System.out.println(Arrays.toString(s1.getProjects()));
			System.out.println(s1.getSkills());
		}
	}
}
