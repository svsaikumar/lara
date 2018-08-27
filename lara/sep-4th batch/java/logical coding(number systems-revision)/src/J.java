class J 
{
	public static void main(String[] args) 
	{
		int i = 10;
		for(int j = 1; j<= (i/2); j++)
		{
			if(i % j == 0)
			{
				System.out.print(j + ",");
			}
		}
		System.out.println(i);
	}
}
