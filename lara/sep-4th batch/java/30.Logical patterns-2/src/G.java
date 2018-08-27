class  G
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 9; i++)
		{
			if(i <=5)
			{
				for(int j = i; j >= 1; j --)
				{
					System.out.print(j);
				}
				System.out.println();
			}
			else
			{
				for(int j = (10-i); j >= 1; j --)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}	
}
/*
1
21
321
4321
54321
4321
321
21
1

  */ 

