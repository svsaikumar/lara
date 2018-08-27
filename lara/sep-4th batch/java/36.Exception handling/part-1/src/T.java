class T
{
	public static void main(String[] args) 
	{
		try
		{

			System.out.println(1);
			String s1 = null;
			int i = s1.length();
			System.out.println(2);
		}
		catch (NullPointerException ex) //throwable
		{							   
			ex.printStackTrace();//here we should not use SOP
		}
		System.out.println("done");
	}
}
//here there is perfect handler to handle the raised exception