class C
{
	private static C obj = null;
	private C()
	{
	}

	
	public static C getObject()
	{
		if(obj == null)
		{
			obj = new C();
		}	
		return obj;
	}
	
}
//if class contgainglin private constructer, then no one can't create object from outside of A
//we have to create object inside the class A because of private constructer

//whenevr A is loading into the memory , at that time only object is creating 
//getObject() is public and static(we can call it using class name)
//getObject() returning referece of same object