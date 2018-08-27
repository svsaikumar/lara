class  E
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 5; i++)
		{
			for(int j = 1; j <= (i-1); j ++)
			{
					System.out.print(" ");
			}
			for(int j = ((5 -i)*2 +1); j >= 1; j --)
			{
				System.out.print(j);	
			}
			
			System.out.println();	
		}
	}
}
/*
	987654321
	 7654321
	  54321
	   321
	    1

  */ 

