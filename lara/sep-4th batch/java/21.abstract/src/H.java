abstract class A
{
	//H h1 = new H();//this is allowed here
}
class H
{
	public static void main(String[] args)
	{
		A a1 = new A();//error here
		System.out.println("done");
	}
}
//for an abstract class we can't create an object