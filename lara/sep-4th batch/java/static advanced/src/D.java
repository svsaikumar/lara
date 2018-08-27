class  D
{
	static int i = 10;
	static int j = test();
	static int test()
	{
		System.out.println("from test:" + i+ "," + j);


		i = i*2;
		main(null);//calling main method
		return 10 + i;
	}

	static//static initialization block(SIB also comes under initializers)
	{
		System.out.println("from SIB-1:" + i + "," + j);
		i += 10;
		j += 10;
	
	}
	public static void main(String[] args) 
	{
		System.out.println("from main:" + i + "," + j);
		i += 2;
		j += 2;
	}
	static//static initialization block(SIB also comes under initializers)
	{
		System.out.println("from SIB-2:" + i + "," + j);
		i += 5;
		j += 5;
		main(null);
	}
}
