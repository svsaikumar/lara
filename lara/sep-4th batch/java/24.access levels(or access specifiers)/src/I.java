class A 
{
	private void test()
	{
	}
}

class I extends A
{
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test();
		System.out.println("done");
	}
}
//private membes are not involved in inheritance 
//here test() of A is not inherited to I as test() is private in A