class A
{
	private static A obj = new A();
	private A()
	{
	}

	public static A getObject()
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

//whenever A is loading into the memory,at that time only object is creating 
//getObject() is public and static(we can call it using class name)
//getObject() returning referece of same object