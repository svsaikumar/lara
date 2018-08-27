class A < T >
{
	void test(T obj)
	{
	}
}
class M44
{
	public static void main(String[] args) 
	{
		A < ? > a1 = new A<String>();
		a1.test("abc");
		System.out.println("done");
	}
}
//test() atg is generic type, and is not fixed
//by using a1 we can't call test() method