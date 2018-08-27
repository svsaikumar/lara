class M462 
{
	public static void main(String[] args) 
	{
		String s1 = "abcabchellohelloabctesttest";


		char[] x = s1.toCharArray();

		String s2 = "";
		System.out.println("GIVEN STRING IS :" + s1);
		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x.length - i -1; j ++)
			{
				if(x[j] > x[j +1])
				{
					char temp = x[j];
					x[j] = x[j +1];
					x[j +1] = temp;
				}
			}
			
		}	
		System.out.println(x);
		int count =1;
		for(int i = 0; i < x.length - 1; i++)
		{
			if(x[i] == x[i +1])
			{
				count ++;
			}
			else
			{
				System.out.println(x[i] + ":" + count);
				count = 1;
			}
		}
		System.out.println(x[x.length - 1] + ":" + count);
	}
}

