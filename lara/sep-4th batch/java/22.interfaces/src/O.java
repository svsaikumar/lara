interface A
{
	void test1();
}
class B
{
	void test1()
	{
		System.out.println("from test-1");
	}
}
class O extends B implements A
{
	public void test1()
	{
		System.out.println("from test-1");
	}
	public static void main(String[] args)
	{
		O o1 = new O();
		o1.test1();
		o1.test1();
		System.out.println("done");
	}
}
//the order is extends and then implements.this order should be followed