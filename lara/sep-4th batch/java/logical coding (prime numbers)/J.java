class J//given number of prime numbers 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("supply one int CLA ");
			System.exit(0);
		}
		int total = Integer.parseInt(args[0]);
		boolean isPrime = true;
		int primeCount = 0;
		int num = 2;
		while(primeCount < total)
		{
			isPrime = true;
			for(int i = 2; i <= num/2; i++)
			{
				if(num % i == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(num + ", ");
				primeCount ++;
			}
			num++;
		}//end of while loop
		
	}
}
