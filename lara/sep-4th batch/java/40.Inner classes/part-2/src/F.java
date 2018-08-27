class  F
{
	class B
	{
	}

	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new F().new B();//we didn't get error here as we using outer class object
		C c1 = new C();
		System.out.println("done");
	}
}