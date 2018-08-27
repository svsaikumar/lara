class A
{
	
	void test1()
	{
		System.out.println("A.test-1");
	}
	void test2()
	{
		System.out.println("A.test-2");
	}
}
class  M6
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test1();
		a1.test2();

		A a2 = new A()//anonymous inner class(a new class in main method)
		{

			
		};
		a2.test1();
		a2.test2();
		System.out.println("done");
	}
}
//desigining a subclass to A but not overriding any method.it contains all the methods of superclass
//anonymous inner class should with semi colon
//anonymous innrer class is for only one object creation purpose
//whwre anonympu inner class developing  there only we have to use new operator for object creation
//we can't develop any constructers in the anunymous inner class(as there is no name for anonymous inner class)
//we can develop IIB inside anonymous inner class for initializing non-static members
//new members of anonymous inner class can't be used outside inner class