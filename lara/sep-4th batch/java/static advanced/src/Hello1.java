class O 
{
	public static void main(String[] args) 
	{
		System.out.println("O-main");
	}
	static
	{
		System.out.println("O-SIB");
	}
}
class P 
{
	public static void main(String[] args) 
	{
		System.out.println("P-main begin");
		O.main(null);
		System.out.println("P-main end");
	}
	static
	{
		System.out.println("P-SIB");
	}
}
