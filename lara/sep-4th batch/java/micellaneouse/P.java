class P 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("please supply one CLA");
			System.exit(0);
		}
		System.out.println(args[0]);
	}
}