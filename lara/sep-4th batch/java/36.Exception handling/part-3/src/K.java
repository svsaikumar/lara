class K
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		test();//error here
		System.out.println(2);
	}
	public static void test() throws ClassNotFoundException
	{
		System.out.println(3);
		Class.forName("");//no error here, as there is throws
		System.out.println(4);
	}
}
//here we get compile time error