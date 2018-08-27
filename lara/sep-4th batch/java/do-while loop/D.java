class  D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		do
		{
			System.out.println("from do while:" + i);
			i--;
		}
		while (i >= 5)//here there is no semi colon . so we get error
		System.out.println("main end");
	}
}