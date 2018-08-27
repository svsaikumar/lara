class S 
{
	static int i = 10;
	static int j = test();// this  is also a intilizer.test method is calling
	static int test()
	{

		return 20;
	}
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
	}
}
//we can call a method from a initializer