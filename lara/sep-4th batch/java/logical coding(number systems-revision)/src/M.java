class M 
{
	public static void main(String[] args) 
	{
		int num = 29;
		boolean primeStatus = true;
		for(int i = 2; i <= (num / 2); i++)
		{
			if(num % i == 0)
			{
				primeStatus = false;
				break;
			}
		}

		if(primeStatus)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " is not a prime number");
		}
	}
}
