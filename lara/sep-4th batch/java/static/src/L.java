class L 
{
	static int x;
	public static void main(String[] args) 
	{
		System.out.println("a:" + x);

		int x = 10;
		System.out.println("b:" + x);
		System.out.println("c:" + L.x);//here we are accessing global variable X
	}
}
//local varable is prefarble than global
