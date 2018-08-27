class H 
{
	public static void main(final String[] args) 
	{
		args[0] = "abc";//here we are not modifying args, we are modifying args[0] so we didn't get any error
		System.out.println("done");
		
	}
}
//any method argument also can be final
//here we get exception because we have to run with a argument
