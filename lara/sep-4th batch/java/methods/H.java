class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}

	public static void test1() 
	{
		System.out.println("test 1 begin");
		test2();
		System.out.println("test 1 end");

	}
	public static void test2() 
	{
		System.out.println("test 2");
	}
	
}
//we can call a method from any other methods
//method should have a return type(it is mandatory)
//if the return type is other than void, then there should be a return statement in the method	
/*there are 3 different data types
		1.void
		2.any primitive data type
		3.any derived data type
*/

//method return name should be before name of the method
//void means it should not return a value 
// void method should not return any value to it's calling method