class M34 
{
	/*public static void test(byte b1) 
	{
		System.out.println("byte");
	}*/
	public static void test(double b1) 
	{
		System.out.println("double");
	}
	public static void test(Byte b1) 
	{
		System.out.println("Byte");
	}
	public static void test(Integer b1) 
	{
		System.out.println("Integer");
	}
	public static void test(Number b1) 
	{
		System.out.println("Number");
	}
	public static void test(Object b1) 
	{
		System.out.println("object");
	}
	public static void test(byte ... b1) 
	{
		System.out.println("byte ...");
	}
	public static void main(String[] args)
	{
		byte b1 = 10;
		test(b1);
	}
}
//first preference goes to widening of same object type
//auto-widening to double