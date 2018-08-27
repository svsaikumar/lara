class A
{
	void test()
	{
		System.out.println("from A.test()");
	}
}
class Q extends A 
{
	void test(int i)//overlaoding
	{
		System.out.println("from subclass.test()");
	}
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.test();
		q1.test(10);
		System.out.println("done");
	}
}
//inherited method got overloaded with another method of same name