class  G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		do
		{
			System.out.println("do while-1-begin:" + i);
			int j = 10;
			do
			{
				System.out.println("do while-2:" + j);
				j--;

			}
			while (j > 8);
			System.out.println("do while-1-end:" + i);
			i++;
		}
		while(i < 4);
		System.out.println("main end");
	}
}
