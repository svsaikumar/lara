class  H
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<= 9; i++)
		{
			if(i <=5)
			{
				for(int j = 5; j >= 1; j --)
				{
					if( j<= i)
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
       0
	  00
	 000
	0000
   00000
  000000
 0000000
  000000
   00000
    0000
	 000
	  00
	   0

  */ 

