class I//re
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{

			System.out.println(" supply one int CLA");
			System.exit(0);
		}
		int num =Integer.parseInt(args[0]);
		System.out.print("prime numbers upto  " +num +" are:");
		
		for(int i = 3; i <= num; i++)
		{
			for(int j = 2; j<i;j++)
			{
				if(i % j != 0)
				{
					System.out.print(i+ " ,");
					break;
					
				}
					else
					{
						//System.out.print(i+ " ,");
						continue;
					}		
			}
		
		}
	}

}
