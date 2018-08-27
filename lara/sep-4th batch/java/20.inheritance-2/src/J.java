class I
{
	static
	{
		System.out.println("I-SIB");
	}
}


class J extends I
{
	static
	{
		System.out.println("J-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
