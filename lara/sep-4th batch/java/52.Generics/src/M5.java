class A
{
	void test(String arg)
	{
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.test("abc");
		a2.test("hello");
		a3.test("xyz");
		System.out.println("done");
	}
}
//for every method call, argument data type is fixed
//test() method argument is same