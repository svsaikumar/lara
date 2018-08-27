interface B
{
	default void test()
	{
		System.out.println("from B.test()");
	}
}
class B implements B
{
		
}
class M6 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.test();
		System.out.println("done");
	}
}
//non static default methods of interface will inherit to subclass
//we can't use as B.test as test method is non static
//we cannot create an object to B.we have to go for sub class.
/*test method is non static so we can't use B.test as it is non static.we have to create an object to B,but we can't create.
we have to go for subclass.defining a sub class and making that subclass as concrete by implementiong any unimplemented method creating 
an object to that subclass.through reference of that object it is called
*/


