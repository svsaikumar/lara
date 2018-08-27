class M1 
{
	public static void main(String[] args) 
	{
		Shared s1 = new Shared();
		Shared s2 = new Shared();

		A a1 = new A(s2);//statement-3
		B b1 = new B(s1);//statement-4
		a1.start();
		b1.start();
		System.out.println("done");
	}
}
//one object sharilng to 2 threads
//both the threads are using one shared object
//both the threads are calling test1() method

/* 
statement-1			statment-2			statement-3			statemenr-4		result
==========			==========			===========			===========		=======
s1.test1()			s1.test1()			new A(s1);			new B(s1);		==>		
s1.test1()			s1.test2()			new A(s1);			new B(s1);		==>		
s1.test2()			s1.test2()			new A(s1);			new B(s1);		-->-->
s1.test2()			s1.test2()			new A(s1);			new B(s2);		-->-->
s1.test1()			s1.test2()			new A(s1);			new B(s2);		==>
s1.test1()			s1.test2()			new A(s2);			new B(s2);		-->-->
s1.test2()			s1.test2()			new A(s2);			new B(s2);		-->-->
s1.test2()			s1.test1()			new A(s1);			new B(s1);		-->-->
s1.test2()			s1.test1()			new A(s2);			new B(s2);		==>
s1.test1()			s1.test1()			new A(s2);			new B(s2);		==>
s1.test2()			s1.test1()			new A(s2);			new B(s1);		==>




s1.test3()			s1.test4()			new A(s1);			new B(s2);		==>
s1.test3()			s1.test3()			new A(s1);			new B(s2);		-->-->
s1.test4()			s1.test3()			new A(s1);			new B(s2);		==>
s1.test5()			s1.test6()			new A(s1);			new B(s2);		-->-->
s1.test6()			s1.test5()			new A(s1);			new B(s2);		-->-->
s1.test6()			s1.test5()			new A(s1);			new B(s2);		







*/