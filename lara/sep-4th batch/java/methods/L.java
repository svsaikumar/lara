class L 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(true)
		{
			System.out.println("from if");
			return;//returning to main method.so the program terminates here, doesn't execute further.
		}
		System.out.println("main end");//not executing this statement
	}
}