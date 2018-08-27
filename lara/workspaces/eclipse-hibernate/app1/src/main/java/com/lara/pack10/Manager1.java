package com.lara.pack10;



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
		Transaction t = s1.beginTransaction();
		s1.save(add);
		t.commit();
		System.out.println("done");
	}
}
//we can use save of persist
//bi-directinal one to one mapping