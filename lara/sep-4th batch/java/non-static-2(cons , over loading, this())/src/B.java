class B 
{
	public static void test(B obj)
	{
		System.out.println("test:" + obj);
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("main:" + b1);
		test(b1);
	}
}
