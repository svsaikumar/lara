class M463 
{
	public static void main(String[] args) 
	{
		String s1 = "abcabchellohelloabctesttest";

		String s2 = "";
		System.out.println("GIVEN STRING IS :" + s1);
		for(int i = s1.length()-1; i >= 0; i--)
		{
			char c1 = s1.charAt(i);
			if(s2.indexOf(c1) == -1)
			{
				int count = 0;
				for(int j = s1.length()-1; j >= 0; j--)
				{
					if(c1 == s1.charAt(j))
					{
						count ++;
					}
				}
				System.out.println(c1 + ":" + count);
				s2 = s2 + c1;
			}
		}	
		System.out.println("done");
	}
}
