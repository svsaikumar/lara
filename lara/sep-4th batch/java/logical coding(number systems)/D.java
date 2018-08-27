class D //number of digits
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("please supply one command line argument");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int count = 0;
		int i = num;
		while(i != 0)
		{
			i = i/10;
			count ++;
		}
		System.out.println("digits count in " + num + " is " + count);
	}
}
