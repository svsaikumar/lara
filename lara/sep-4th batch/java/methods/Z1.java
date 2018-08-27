class Z1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		boolean b1 = test();
		System.out.println("boolean value:" + b1);
		System.out.println("main end");
	}

	public static boolean test() 
	{
		System.out.println("from test");
		return true;
	}
}
//any class type,any interface type, any enum type comes under derived data type