class C
{
	public static void main(String[] args) 
	{

		int i = 0, j = 1, k = 0;
		
		
		while((k = i + j) < 10)
		{	
			i = j;
			j = k;
		}

			System.out.println("fib series in the reverse:");
			System.out.print(j + "," );
			while( i > 0)
			{
				i = k -j;
				System.out.print(i + ",");
				k = j;
				j = i;
			}
			System.out.println();
	}
	
}

