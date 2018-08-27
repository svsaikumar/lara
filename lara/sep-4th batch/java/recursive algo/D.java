class D 
{
	public static void main(String[] args) 
	{
		test(1);
	}
	public static void test(int i) 
	{
		
		System.out.println(i++);
		if(i == 11)
		{
			return;
		}
		test(i);
	}
}
