class N 
{
	static 
	{
		System.out.println("N-SIB");
	}

	N() 
	{
		System.out.println("N()");
	}
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		N n1 = new N();
		System.out.println("==========");
		N n2 = new N();
		System.out.println("==========");
		N n3 = new N();
		System.out.println("main end");
	}
}
//SIB exdecutes only one time while loading the class
