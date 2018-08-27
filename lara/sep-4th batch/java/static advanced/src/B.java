class  B
{
	static int i = 10;
	static int j = test();
	static int test()
	{
		System.out.println("from test:" + i+ "," + j);
		return 10 + i;
	}
	static//static initialization block(SIB also comes under initializers)
	{
		System.out.println("from SIB:" + i + "," + j);
	}
	public static void main(String[] args) 
	{
		System.out.println("from main:" + i + "," + j);
	}
}
//the order for intializers is from top to bottom