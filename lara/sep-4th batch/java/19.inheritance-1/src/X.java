class W 
{
	W(int i, int j)
	{
		System.out.println("W(int)");
	}
}
class X extends W
{
	//here compiler will create default no arg constructer
	public static void main(String[] args)
	{
		
		System.out.println("done");
	}
}