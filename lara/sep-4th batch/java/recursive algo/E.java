class E 
{
	public static void main(String[] args) 
	{
		test(1);
	}
	public static void test(int i) 
	{
		
		System.out.println(i++);
		if(i == 5)
		{
			return;
		}
		test(i);
		System.out.println(--i);
	}
}
//the method calling from the same method is called recursion
