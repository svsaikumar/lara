interface  B
{
	static void test()
	{
		System.out.println("B.test()");
	}
}
class M1
{
	public static void main(String[] args) 
	{
		B.test();
		//M1.test(); not valid as static method is limited to that interface B only
		System.out.println("done");
	}
}
//from JDK 1.8 we can develop static defined methods and default defined methods inside interface 
//we can call static test in interface B directly from a static(as both are static)
//SIB are not allowed in interface