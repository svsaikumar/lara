class  B
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();
		System.out.println(2);
	}
	public static void test()
	{
		System.out.println(3);
		int i = 10/0;//arithmetic(unchecked)
		System.out.println(4);
	}
}
//it is unchecked exception so compiler is not worrying about it
// if there is any  unhandled exception object then remaining portion is not executed
//main method is forcebly removing from the stack
