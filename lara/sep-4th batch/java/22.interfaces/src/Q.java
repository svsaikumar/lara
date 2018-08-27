interface A
{
	void test1();
}
interface B
{
	void test2();
}
interface C extends A,B
{
	void test3();
}
class Q implements C
{
	public void test1()
	{
		System.out.println("from test-1");
	}
	public void test2()
	{
		System.out.println("from test-2");
	}
	public void test3()
	{
		System.out.println("from test-3");
	}
	public static void main(String[] args)
	{
		Q q1 = new Q();
		q1.test1();
		q1.test2();
		q1.test3();
		System.out.println("done");
	}
}
//class to class is extends
//class to interface is implements
//interface to interface is also extends
//interface can extend with any number of super interfaces
//multiple inheritance is possible with  only through interfaces in java
//interface should not have any concrete methods