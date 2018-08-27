class M7 
{
	static void test(Object obj)
	{
	}


	public static void main(String[] args) 
	{
		test(new A());
		test(new B());
		test(new C());
		test(new D());//test((Object) new D());
		test(new E());//test((Object) new E());
		C c1 = null;
		test(c1);
		test("abc");//String is a subclass to object class.so we can supply a string
		System.out.println("done");
	}
}
// every class is a subclass to object class.so we didn't get error  here
