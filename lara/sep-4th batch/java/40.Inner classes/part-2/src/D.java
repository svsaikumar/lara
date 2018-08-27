class  D
{
	class B
	{
	}

	static class C
	{
		
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		C c1 = new C();
		System.out.println("done");
	}
}
//we can't use non-static class-B in static method(for object creating purpose which is not for data type purpose)