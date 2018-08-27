class F
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{

			System.out.println(" supply one int CLA");
			System.exit(0);
		}
		int num =Integer.parseInt(args[0]);
		System.out.print("Factors of " +num +" are:");
		for(int i =1; i<= num; i++)
		{
			if(num % i == 0)
			{
				System.out.print(i + ", ");
			}
		}
		
	}

}
