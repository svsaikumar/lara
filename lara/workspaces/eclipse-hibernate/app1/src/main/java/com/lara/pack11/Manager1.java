package com.lara.pack11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lara.Util;

public class Manager1 
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		
		Student st = new Student();
		st.setName("abc");
		st.setMobileNos(new int[]{984802233, 984803291});
		String []projects = {"citi", "hdfc", "kotak" };
		st.setProjects(projects);
		
		
		Collection list = new ArrayList();
		list.add("C");
		list.add("C++");
		list.add("JAVA");
		st.setSkills(list);
		
		
		List marks = new ArrayList();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		st.setMarks(marks);
		
		Set jobs = new HashSet();
		jobs.add("software");
		jobs.add("hardware");
		jobs.add("teacher");
		st.setJobs(jobs);
		
		Map educations = new HashMap();
		educations.put("degree", "B.Se");
		educations.put("post-degree", "M.Sc");
		st.setEducations(educations);
		
		Transaction t = session.beginTransaction();
		session.save(st);
		t.commit();
		System.out.println("done");
			
	}
}
