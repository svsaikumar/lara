class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int[] x = new int[9];
			System.out.println(2);
		}
		catch (OutOfMemoryError ex) //throwable
		{							   
			ex.printStackTrace();//here we should not use SOP
		}
		System.out.println("main end");
	}
}
//if there is no exception or error then catch will not execute