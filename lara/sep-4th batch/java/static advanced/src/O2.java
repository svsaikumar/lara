public class O2
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
class P2 
{
	public static void main(String[] args) 
	{
		int i = 291;
		System.out.println("P-main");
		O2.main(null);
		System.out.println("P-end");
	}
	static
	{
		System.out.println("P-SIB");
	}
}