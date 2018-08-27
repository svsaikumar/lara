class Y 
{
	static int i = test();

	static int test()
	{
		System.out.println("from test");
		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println("main");

	}
}
//any method can be used or called in any intiitializer if the assignment is proper
//global variable can be used in any method, no matter where that method is defined
//while using any glaobal variable in the  initializer the order should be followed