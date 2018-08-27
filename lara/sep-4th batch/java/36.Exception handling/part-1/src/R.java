class R 
{
	public static void main(String[] args) 
	{
		try
		{

			System.out.println(1);
			int i = 10/0;
			System.out.println(2);

		}
		catch (ArithmeticException ex) //throwable
		{							   
			ex.printStackTrace();//here we should not use SOP
		}
		System.out.println("done");
	}
}
//we will get class name, exception line, type of exception,method name
//it is recommended to keep printStackTrace() inside catch to know the information about exception