class A 
{
	public static void main(String[] args) 
	{
		int i = 0, j =1;
		System.out.println("fib series");
		System.out.println(i + "," + j);
		int k = 0;
		while(k < 100)
		{
			k = i +j;
			if(k <= 100)
			{
				System.out.print(k + ",");
				i = j;
				j = k;
			}
		
		}
	}
}

