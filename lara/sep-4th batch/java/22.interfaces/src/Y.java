class A
{
	
	void test()
	{
		System.out.println("A-test()");
	}
}
class  B extends A
{
	void test()
	{
		System.out.println("B-test()");
	}
}
class Y
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
//over riding-same signature whatever the name is(same or different)
// A -class test method  is not available in B whicch is over riding
//method is attempting to over ride