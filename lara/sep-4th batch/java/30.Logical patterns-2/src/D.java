class  D
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 5; i++)
		{
			for(int j =1; j <= (10-i); j ++)
			{
				if(j<i)
				{
					System.out.print(" ");
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
	000000000
	 0000000
	  00000
	   000
	    0

  */