class E 
{
	static int x;
}




class F extends E
{
	static int y;
	public static void main(String[] args) 
	{
		System.out.println(E.x);
		System.out.println(F.y);
	}
}
//static members can be used in directly in inheritance