class  D1
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 5; i++)
		{
			for(int j =1; j <= (i-1); j ++)
			{
				System.out.print(" ");
			}
				for(int j = 1; j <= ((5-i)*2 +1); j++)
				{
				System.out.print(0);
				}
			
			System.out.println();	
		}
	}
}
/*
	000000000
	 0000000
	  00000
	   000
	    0

  */ 

