package com.lara.pack12;

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
		st.setId(1);
		st.setName("abc");
		st.setMobileNos(new int[]{984802233, 984803291});
		String []projects = {"citi", "hdfc", "kotak" };
		st.setProjects(projects);
		
		
		Collection<String> list = new ArrayList<String>();
		list.add("C");
		list.add("C++");
		list.add("JAVA");
		st.setSkills(list);
		
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(100);
		marks.add(200);
		marks.add(300);
		st.setMarks(marks);
		
		Set<String> jobs = new HashSet<String>();
		jobs.add("software");
		jobs.add("hardware");
		jobs.add("teacher");
		st.setJobs(jobs);
		
		Map<String, String> educations = new HashMap<String, String>();
		educations.put("degree", "B.Se");
		educations.put("post-degree", "M.Sc");
		st.setEducations(educations);
		
		Transaction t = session.beginTransaction();
		session.save(st);
		t.commit();
		System.out.println("done");
			
	}
}
