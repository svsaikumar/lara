abstract class A 
{
	abstract void test();
}
class B extends A
{
	void test()
	{
		System.out.println("from B.test()");
	}	
}
class C extends A
{
	void test()
	{
		System.out.println("from C.test()");
	}	
}
class M4
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		A a2 = new C();
		A[] elements = {a1, a2};
		for(A element : elements)
		{
			element.test();	
		}					
		
	}

}
//here B cannot be converted into C
//and C cannot be converted into B as there is no any relation between them
//polymorphism can be done for abstract and interface also