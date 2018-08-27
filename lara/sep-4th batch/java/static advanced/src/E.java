class E 
{
	static 
	{
		System.out.println("E-SIB-1");
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	static 
	{
		System.out.println("E-SIB-2");
	}
}
//before main method all the static methods are executed
//by using initializers we can execute our required statements or methods before main method