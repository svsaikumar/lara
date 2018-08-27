class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();
		System.out.println("=========");
		test();
		System.out.println("=========");
		System.out.println("main end");
		
	}
	public static void test()//defining a method
	{
		System.out.println("from test");
	}
}
//a method can be called any number of times
//a method can be used any number of times
//a method can be executes any number of times
//in order to achieve to reusability we use methods(reusable code)