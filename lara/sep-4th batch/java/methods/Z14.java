class Z14 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main-1:" + i);
		test(i);
		System.out.println("main-2:" + i);
	}

	public static void test(int i)
	{
		i = 20;
		//System.out.println(i); //here 20 will print
	}
}
//changes in the  target not sending to source
//here assume main method is source and test method is a target
//pass by value