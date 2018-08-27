class  F1
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 9; i++)
		{
			if(i <=5)
			{
				for(int j = 1; j <= i; j ++)
				{
					System.out.print(0);
				}
				System.out.println();
			}
			else
			{
				for(int j = 1; j <= (10-i); j ++)
				{
					System.out.print(0);
				}
				System.out.println();
			}
		}
	}	
}
/*
0
00
000
0000
00000
0000
000
00
0

  */ 

