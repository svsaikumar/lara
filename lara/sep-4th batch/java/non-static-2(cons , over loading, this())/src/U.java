class U 
{
	U(int i)
	{
		System.out.println("U(int)");
	}
	U(double i)
	{
		System.out.println("U(double)");
	}

	public static void main(String[] args) 
	{
		U obj1 = new U(10);
		System.out.println("==========");
		U obj2 = new U(1.0);
		System.out.println("==========");
	}
}
