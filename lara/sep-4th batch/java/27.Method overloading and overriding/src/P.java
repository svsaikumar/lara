class A
{
	void test()
	{
		System.out.println("from A.test()");
	}
}
class P extends A
{
	void test()//overrided
	{
		System.out.println("from P.test()");
	}
	public static void main(String[] args)
	{
		P p1 = new P();
		p1.test();
		System.out.println("done");
	}
}
//overriding - same signature(for abstract method implementation also we have to go for same signature)
//A class test method overrided in P class
//