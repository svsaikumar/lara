class D 
{
	public static void test(int d1) 
	{
		System.out.println("test:" + d1);
	}
	public static void main(String[] args) 
	{
		byte b1 = 100;
		short s1 = 100;
		int i = 100;
		test(b1);//test((int)b1);
		test(s1);//test((int)s1);
		test(i);//test((int)i);
		
	}
}
//here converting from narrower to wider is done automatically by the compiler
//we can convert it by explicitly.But is not mandatory