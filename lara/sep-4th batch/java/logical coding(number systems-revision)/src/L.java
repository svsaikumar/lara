class L 
{
	public static void main(String[] args) 
	{
		int num = 10;
		boolean isPrime = true;
		for(int i = 2; i <= num / 2; i++)
		{
			if(num % i == 0)
			{
				isPrime = false;
				break;
			}
		}
		System.out.println(num + " prime status:" + isPrime);
	}
}
