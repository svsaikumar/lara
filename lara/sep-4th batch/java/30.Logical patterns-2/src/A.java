class  A
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
				System.out.print("0");
			}
			System.out.println();	
		}
	}
}
/*
	  0
	 000
	00000
   0000000
  000000000

  */