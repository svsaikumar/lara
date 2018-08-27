class P 
{
	static 
	{
		System.out.println("P-SIB");
	}

	P() 
	{
		this(90);
		System.out.println("P()");
	}

	P(int i) 
	{
		System.out.println("P(int)");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P();
		System.out.println("==========");
		P p2 = new P(20);
		System.out.println("==========");
		P p3 = new P();
		System.out.println("==========");
		System.out.println("main end");
	}
}
//cons overloading this calling statement
