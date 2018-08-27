class O 
{
	static 
	{
		System.out.println("O-SIB");
	}

	O() 
	{
		System.out.println("O()");
	}

	O(int i) 
	{
		System.out.println("O(int)");
	}
	public static void main(String[] args) 
	{

		System.out.println("main begin");
		O o1 = new O();
		System.out.println("==========");
		O o2 = new O(20);
		System.out.println("==========");
		O o3 = new O();
		System.out.println("==========");
		System.out.println("main end");
	}
}
//SIB exdecutes only one time while loading the class
