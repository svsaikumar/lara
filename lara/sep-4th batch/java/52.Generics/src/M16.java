interface A < X >
{
	X test1();
	void test2(X x1);
	void test3(X x1, X x2);
}
class  B implements A<String>
{
	public String test1()
	{
		return null;
	}
	public void test2(String s1)
	{

	}
	public void test3(String s1, String s2)
	{

	}
}
class C implements A <Integer>
{
	public Integer test1()
	{
		return null;
	}
	public void test2(Integer s1)
	{

	}
	public void test3(Integer s1, Integer s2)
	{

	}
}
class M16
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		String s1 = b1.test1();
		b1.test2(10);
		b1.test3("abc", "xyz");

		C c1 = new C();
		Integer s2 = c1.test1();
		c1.test2(12);
		c1.test3(10,20);

		System.out.println("done");
	}
}
