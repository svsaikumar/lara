class G //armstrong
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("please supply one command line argument");
			return;
		}
		int num = Integer.parseInt(args[0]);
		int i = num; int j = num;
		int count = 0;
		while(i != 0)
		{
			i = i/10;
			count ++;
		}
		int sum = 0, value = 0, digit = 0;
		while(j != 0)
		{
			digit = j % 10;
			value = 1;
			for(int m = 1; m <= count; m++)
			{
				value = value * digit;
			}
			sum += value;
			j = j / 10;
		}
		if(num == sum)
		{
			System.out.println( num + " is armstrong");
		}
		else
		{
			System.out.println( num + " is not armstrong");
		}
	}
}
