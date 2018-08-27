class N 
{
	public static void main(String[] args) 
	{
		int num1 = 1;
		int num2 = 1000;
		for(int i = num1; i <= num2; i++)
		{
			boolean isPrime = true;
			for(int j = 2; j <= i/2; j++)
			{
				if(i % j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i + ",");
			}
		
		}
	}
}
