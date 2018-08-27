class Z2 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = test();
		System.out.println("String value:" + s1);
		System.out.println("main end");
	}
	public static String test() 
	{
		System.out.println("from test");
		//return "Hello to all";
		return "\"Hello to all\"";
	}
}

//any class type,any interface type, any enum type comes under derived data type