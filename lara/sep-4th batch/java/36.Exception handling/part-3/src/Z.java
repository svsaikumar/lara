class A
{
	A() throws ClassNotFoundException
	{
	}
}
class  Z extends A
{
	Z() throws ClassNotFoundException
	{
		super();
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//Z is subclass to A
//throws keyword is required only for checked exceptions
//for unchecked exceptions  throws is not required