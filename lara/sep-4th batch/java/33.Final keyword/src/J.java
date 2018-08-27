class J 
{
	static void test(int x,final int y)
	{
		x = 10;
		y = 10;//error
		System.out.println("=============");
		x = 10;
		y = 10;//error
		System.out.println("=============");
	}
}
//final variable in arguments also should not be initialized further
