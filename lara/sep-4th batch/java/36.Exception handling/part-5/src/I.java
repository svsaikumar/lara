class I 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try(H h1 = new H())//close method is calling from h1
		{
			System.out.println("from try");
		}
		catch(Exception ex)
		{
			System.out.println("ex");
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
//we can open resources which are close type in paranthesis of try
//h1 is local to try.we can use h1 but we can't re-initialize h1
//we can use h1 in throughout the body of try
//once try is executed then automaticallt close is executed
//after the closing of try, resources are automatically executed.we don't require to call h1 explicitly
//that resource is automatically close, we don't require to call it and close it explicitly(autoresource closing)


//the resource in parathesis should be closable type
//h1 can't used  outside try
//h1 should not be re-initialize.it's acts as final