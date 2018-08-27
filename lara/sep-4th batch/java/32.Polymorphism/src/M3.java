abstract class A 
{
	abstract void test();
}
class B extends A
{
	void test()
	{
		System.out.println("from B.test()");//here test method is implemented
	}	
}
class C extends B
{
	void test()
	{
		System.out.println("from C.test()");//here test method it is overrided
	}	
}
class M3
{
	public static void main(String[] args) 
	{
		A a1 = new B();//autoupcasting
		A a2 = new C();//autoupcasting
		A[] elements = {a1, a2};
		for(A element : elements)
		{
			element.test();	//element is pointing to a1, a2 in 2 interations for 2 differet objects B,C
		}					
		
	}

}
//A class abstract test method got implemented in B class
//B class test method got overrided in C class