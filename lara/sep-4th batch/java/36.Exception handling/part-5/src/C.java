class C
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			System.out.println("from if");
			throw new OutOfMemoryError("something went wrong");
			//throw new SQLException("something went wrong");
		}
		System.out.println(2);
	}
}
//we can ask to run time environment to rise error object or exception object(it should be a throwable type)