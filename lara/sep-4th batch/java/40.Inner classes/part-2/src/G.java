class  G
{
	class B
	{
	}

	static class C
	{
	}
	public static void main(String[] args) 
	{
		B b1 = new G().new B();//we didn't get error here as we using outer class object
		C c1 = new G.C();//here G class name is optional.object is not creating to G class only we are using G class to refer the C object
		System.out.println("done");
	}
}