class W 
{
	static int i = 20;
	static int j = k;//here the order is not following
	static int k;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		
	}
}
//the order is first declaration and then initialization