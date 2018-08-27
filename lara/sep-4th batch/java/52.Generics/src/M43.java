class A < T >
{
	T obj;
}
class M43
{
	static void test(A <?> arg)
	{
		arg.obj = "abc";
	}

	public static void main(String[] args) 
	{
		test(new A<String>());
		System.out.println("done");
	}
}
//test() argument is wild card type.there is a possiblity of any type of A as an arg to test() method