class B 
{
	public static void test() 
	{
		System.out.println("test");
	}

	public static void main(String[] args) 
	{
		test();
		System.out.println("main");
		test();
	}
}
//a method can be called any number of times
//no matter where main method,it will execute wherever it is
