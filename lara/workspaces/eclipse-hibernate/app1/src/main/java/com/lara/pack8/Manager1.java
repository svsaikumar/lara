package com.lara.pack8;



import org.hibernate.Session;
import org.hibernate.Transaction;
import com.lara.Util;



public class Manager1 
{
	public static void main(String[] args)
	{
		Session s1 = Util.getSession();
		Student st = new Student();
		st.setId(101);
		st.setFirstName("Ramu");
		st.setLastName("vijay");
		
		Address add = new Address();
		add.setHouseNo("123/T");
		add.setStreetName("BTM");
		add.setStudent(st);
		st.setPermanentAddress(add);
		Transaction t = s1.beginTransaction();
		s1.save(st);
		//s1.persist(add);
		t.commit();
		System.out.println("done");
	}
}
