class V 
{
	static
	{
		System.out.println("V-SIB");
	}

	V()
	{
		System.out.println("V()");
	}
}
class W extends V
{
	W()
	{
		System.out.println("W()");
	}

	static
	{
		System.out.println("W-SIB");
	}
}
class X extends W
{
	

	X()
	{
		System.out.println("x()");
	}

	static
	{
		System.out.println("X-SIB");
	}

	{
		System.out.println("X-IIB");
	}
}
class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V v1 = new V();
		System.out.println("===========");
		X x1 = new X();
		System.out.println("main end");
	}
}
//any class loading to the memory only one time
