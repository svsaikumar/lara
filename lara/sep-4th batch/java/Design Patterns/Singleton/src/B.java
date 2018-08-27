class B
{
	private static B obj = null;
	private B()
	{
	}

	static
	{
		//some kind of process
		obj = new B();
	}

	public static B getObject()
	{
		return obj;
	}
	public static void main(String[] args)
	{
		
		System.out.println("done");
	}
}
//if class contgainglin private constructer, then no one can't create object from outside of A
//we have to create object inside the class A because of private constructer

//whenevr A is loading into the memory , at that time only object is creating 
//getObject() is public and static(we can call it using class name)
//getObject() returning referece of same object