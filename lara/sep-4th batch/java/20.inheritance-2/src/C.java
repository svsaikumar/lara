class C 
{
	C()
	{
		System.out.println("C()");
	}



	{
		System.out.println("C-IIB");
	}
}
class D extends C
{
	D()
	{
		System.out.println("D()");
	}

	{
		System.out.println("D-IIB");
	}

	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("============");
		D d1 = new D();
	}
}
