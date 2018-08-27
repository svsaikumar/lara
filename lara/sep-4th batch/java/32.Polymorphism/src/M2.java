class A 
{
	void test()
	{
		System.out.println("from A.test()");
	}
}
class B extends A
{
	void test()
	{
		System.out.println("from B.test()");
	}	
}
class C extends B
{
	void test()
	{
		System.out.println("from C.test()");
	}	
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new B();//autoupcasting
		A a3 = new C();//autoupcasting
		A[] elements = {a1, a2, a3};
		for(A element : elements)
		{
			element.test();	//element is pointing to a1, a2, a3 in 3 interations for 3 differet objects A,B,C
		}					
		
	}

}
//A class test method got overrided in B class
//B class test method got overrided in C class