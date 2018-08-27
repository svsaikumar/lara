class E 
{
	E()
	{
		this(10);
		//calling statement to IIB of E class
		System.out.println("E()");
	}

	E(int i)
	{
		//super();
		//calling statement to IIB of E class
		System.out.println("E(int)");
	}

	{
		System.out.println("E-IIB");
	}
}
class F extends E
{
	F()
	{
		//super(10);
		//calling statement to IIB of F class
		System.out.println("F()");
	}

	F(int i)
	{
		//super();
		//calling statement to IIB of F class
		System.out.println("F(int)");
	}

	{
		System.out.println("F-IIB");
	}

	public static void main(String[] args) 
	{
		//E e1 = new E();
		System.out.println("============");
		//E e2 = new E(20);
		System.out.println("============");
		//F f1 = new F(20);
		System.out.println("============");
		F f2 = new F();
		System.out.println("============");
	}
}
//first super class initialization then sub class initialization