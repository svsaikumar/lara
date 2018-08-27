class E 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("please supply one command line argument");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int i = num;
		
		int sum = 0, digit = 0;
		while(i != 0)
		{
			digit = i%10;
			sum += digit;
			i = i/10;
		}
		System.out.println("digits count in " + num + " is " + sum);
	}
}
