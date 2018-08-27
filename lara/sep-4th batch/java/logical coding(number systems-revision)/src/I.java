class I
{
	public static void main(String[] args) 
	{
		int num = 12345;
		int x = num;
		int sum = 0;
		while(x != 0)
		{
			sum += x % 10;
			x = x/10;
		}
		System.out.println("sum of the given number " + num + " is:" + sum);	
	}
}
