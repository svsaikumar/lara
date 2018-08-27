class Z15 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("main-1:" + i);
		int j = test(i);
		System.out.println("main-2:" + i);
		System.out.println("main-2:" + j);
	}

	public static int test(int i)
	{
		return i++;//here 10 is returning to main although 'i' becomes 11
		
	}
}
