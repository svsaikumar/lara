class H 
{
	H()
	{
		System.out.println("H()");
	}

	{
		System.out.println("H-IIB");
	}

	H(int i)
	{
		this();
		System.out.println("H(int)");
	}
	H(int i, int j)
	{
		this(j);
		System.out.println("H(int, int)");
	}
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println("============");
		H h2 = new H(9,3);
		System.out.println("============");
		H h3 = new H(20,30);
		System.out.println("============");
	}
}
