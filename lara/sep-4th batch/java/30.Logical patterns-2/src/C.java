class  C
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 5; i++)
		{
			for(int j =1; j <= (5-i); j ++)
			{
				System.out.print(" ");
			}

			for(int j =1; j <=(i*2 -1); j++)
			{
				if(i ==1 || i == 5 || j==1 || j==(i*2-1))
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();	
		}
	}
}
/*
	  1
	 101
	10001
   1000001
  111111111

  */