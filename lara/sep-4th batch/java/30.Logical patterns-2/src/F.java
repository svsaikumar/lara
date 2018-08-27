class  F
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 5; i++)
		{
			for(int j = 1; j <= i; j ++)
			{
					System.out.print(0);
			}
			System.out.println();
		}
		for(int i = 1; i<= 5; i++)
		{
			for(int j = 3; j >= i-1; j --)
			{
					System.out.print(0);
			}
			System.out.println();
			
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

