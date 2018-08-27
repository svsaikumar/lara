class F 
{
	static 
	{
		System.out.println("E-SIB-1 begin");
		main(null);//calling main method
		System.out.println("E-SIB-1 end");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	
		static 
		{
			System.out.println("E-SIB-2 begin");
			main(null);//calling main method
			System.out.println("E-SIB-2 end");
		}
	}
}
//before main method all the static methods are executed
//by using initializers we can execute our required statements or methods before main method
//we have to supplu string array to call main method.we can send "null" also instead of it