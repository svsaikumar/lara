class U
{
	public static void main(String[] args) 
	{
		try
		{

			System.out.println(1);
			int[] x = new int[999999999];
			System.out.println(2);
		}
		catch (OutOfMemoryError ex) //throwable
		{							   
			ex.printStackTrace();//here we should not use SOP
		}
		System.out.println("done");
	}
}
//not only exception objects ,we can handle errors also
//throwable is super class to exception and error
//we can handle exception object and error by using try-catch