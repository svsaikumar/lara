class M461 
{
	public static void main(String[] args) 
	{
		String s1 = "abcabchellohelloabctesttest";


		String s2 = "";
		System.out.println("GIVEN STRING IS :" + s1);
		for(int i = 0; i < s1.length(); i++)
		{
			char c1 = s1.charAt(i);
			if(s2.indexOf(c1) == -1)
			{
				int count = 0;
				for(int j = 0; j < s1.length(); j++)
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

