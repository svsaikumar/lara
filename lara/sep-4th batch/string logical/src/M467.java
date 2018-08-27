class M466//anagram or not = all characters in one string is similar to characrters in anothe strings 
{

	
	public static void main(String[] args) 
	{


		String s1 = "cba"; int count = 0;
		char []x = s1.toCharArray();

		String s2 = "acb";
		char []y = s2.toCharArray();
		for(int i = 0; i< x.length; i++)
		{
			char c1 = x[i]; 
			for(int j = 0; j < y.length; j++)
			{
				char c2 = y[j];
				if((x[i] == y[j])) 
				{
					test();
					count++;
					continue;
				}
			}	
		}		
		if(count == x.length )
		{
			
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
