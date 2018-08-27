class M28
{
	static void test(int ... args)
	{
		for(int value : args)
		{
			
			System.out.println(value);
		}
		System.out.println("==============="  );
	}

	public static void main(String[] args) 
	{
		test();
		test(1);
		test(2, 4);
		test(10, 20, 30);
		test(10, 20, 30, 40);
		System.out.println("done");
	}
}
//in JDK1.5 var args got introduced
//here the data type for test method argument is int, and we can supply any number of integer arguements
//var -arg argument is array by default so we can call length
//ars is an array