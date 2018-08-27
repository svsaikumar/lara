class I 
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
		Class.forName("");
		System.out.println(4);
	}
}
//if child class is exception is throws any Exception then automatically parent should handle that exception or throws 
//that exception