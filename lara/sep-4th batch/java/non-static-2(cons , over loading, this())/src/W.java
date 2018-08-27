class W 
{
	W()
	{
		System.out.println("W()");
	}
	W(int i, double j)
	{
		System.out.println("W(int, double)");
	}
	public static void main(String[] args) 
	{
		W w1 = new W();
		System.out.println("===============");
		W w2 = new W(10,2.3);
		System.out.println("===============");
	}
}
//a class can have any numnber of constructers

