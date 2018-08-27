class  I
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=9;i++)
		{
			if(i <= 5)
			{
				for(int j = 1;j <= 5-i;j++)
				{
					System.out.print(0);
				}
				for(int j = 1;j <= ((i-1) * 2) +1;j++)
				{
					System.out.print(" ");
				}
				System.out.println();
			}
			else
			{
				for(int j = 1;j <= i-5;j++)
				{
					System.out.print(0);
				}
				for(int j = 1;j <= ((9-i) * 2) +1;j++)
				{
					System.out.print(" ");
				}
				System.out.println();
			}
			
		}
			
	}

}

/*
	000000000
	0000 0000
	000   000
	00     00
	0       0
	00     00
	000   000
	0000 0000
	000000000


	*/
