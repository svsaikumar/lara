class Z 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char ch = test();
		System.out.println("char value:" + ch);
		System.out.println("main end");
	}
	public static char test() 
	{
		System.out.println("from test");
		return 's';
	}
}
