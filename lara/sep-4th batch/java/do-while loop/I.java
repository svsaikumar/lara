class I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		do
		{
			System.out.println(" dowhile-1-begin:" + i);
			int j = 10;
			do
			{
				System.out.println("do while-2 begin:" + j);
				j--;
				if(j >=8)
				{
					break;
				}
				System.out.println("do while-2-end:" + i);
			}
			while (j > 5);
			System.out.println("do while-1-end:" + i);
			i++;
		}
		while(i < 4);
		System.out.println("main end");
	}
}
