class A
{
	A() throws ClassNotFoundException
	{
	}
}
class  Y extends A
{
	Y() 
	{
		try
		{
			super();
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//super() calling statement should be first statemetn in the constructer