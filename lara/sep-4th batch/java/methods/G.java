class G 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("========");
		test2();
		System.out.println("main end");
	}
	public static void test1() 
	{
		System.out.println("from test1()");
	}
	public static void test2() 
	{
		test1();
		System.out.println("from test2()");
	}
	public static void test3() 
	{
		System.out.println("from test3()");
	}
}
//we can have any number of methods and they can be called any number of times.
//it is optional to call each and every method which is defined,we can call as per our requirement
//not only from the main method ,we can call a method from other methods also
