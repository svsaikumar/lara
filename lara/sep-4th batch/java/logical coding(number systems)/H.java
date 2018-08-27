class H//to verify the given number is a perfect number or not
{
	public static void main(String[] args) 
	{
		if(args.length < 1) 
		{
			System.out.println("please supply one command line argument ");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int sum= 0;
		for(int i = 1;i <= num /2;i++)
		{
			if (num % i ==0 )
			{
				sum += i;
			}
		}
		if(num == sum)
		{
			System.out.println("number " +num + " is a perfect ");
		}
		else
		{
			System.out.println("number " +num + " is not  a perfect ");
		}
	}
}
