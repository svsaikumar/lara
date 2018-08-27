class F 
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
		int count = 0; int digit = num;
		int revNum =0 ;

		while(i != 0)
		{
			digit = i % 10;
			revNum = (revNum * 10) + digit;
			i = i / 10;
		}
		if(num == revNum)
		{
			System.out.println("digits " + num + " is palindrome ");
		}
		else
		{
			System.out.println("digits " + num + " is not palindrome");
		}
	}
}
