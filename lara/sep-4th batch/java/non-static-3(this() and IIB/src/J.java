class J 
{
	static int x;
	public static void main(String[] args) 
	{
		J obj = new J();
		System.out.println(x);
		System.out.println(J.x);
		System.out.println(obj.x);
	}
}
