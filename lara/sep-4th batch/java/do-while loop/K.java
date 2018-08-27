class  K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		xyz:
		do
		{
			System.out.println(" do while-1-begin:" + i);
			
			for(int j = 10;j >= 5; j--)
			{
				System.out.println(" for begin:" + j);
				j--;
				if(j >=8)
				{
					break xyz;//here it breaks all the loop after xyz:
				}
				System.out.println("for end:" + j);
			}
			
			System.out.println(" do while-1-end:" + i);
			i++;
		}
		while(i < 4);
		System.out.println("main end");
	}
}
//