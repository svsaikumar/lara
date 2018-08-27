class K 
{
	public static void main(String[] args) 
	{
		int num = 55;
		for(int j = 1; j<= (num/2); j++)
		{
			if(num % j == 0)
			{
				System.out.print(j + ",");
			}
		}
		System.out.println(num);
	}
}
