class Q 
{
	static
	{
		System.out.println("Q-SIB");
	}




	Q()
	{
		System.out.println("Q()");
	}
}
class R extends Q
{
	R()
	{
		System.out.println("R()");
	}

	static
	{
		System.out.println("R-SIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		Q q1 = new Q();
		System.out.println("===========");
		R r1 = new R();
		System.out.println("main end");
	}
}
//any class loading to the memory only one time
