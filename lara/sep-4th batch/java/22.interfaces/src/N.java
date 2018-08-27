interface A
{
	void test1();
	void test2();
	void test3();
}
class B implements A
{
	public void test1()
	{
		System.out.println("from test1()");
	}
	//void test2();
	//void test3();
}
abstract class C extends B
{
	public void test2()
	{
		System.out.println("from test2()");
	}
}
class  N extends C
{
	public void test3()
	{
		System.out.println("from test3()");
	}
	public static void main(String[] args) 
	{
		N obj = new N();
		obj.test1();
		obj.test2();
		obj.test3();
		System.out.println("done");
	}
}