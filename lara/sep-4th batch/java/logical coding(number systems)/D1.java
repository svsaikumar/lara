class D1 //number of digits
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("please supply one command line argument");
			return;
		}
		System.out.println(args.length);
		
		
		int count = 0;
		int i =;
		while(i != 0)
		{
			i = i/10;
			count ++;
		}
		System.out.println("digits count in " + num + " is " + count);
		
	}
}
