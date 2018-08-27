class M468//balance the brackets 
{
	public static void main(String[] args) 
	{
		int count1 =0;
		int count2 = 0;
		String s1 = "((( ))";
		char []x = s1.toCharArray();
		//System.out.println(x);
		for(int i = 0; i < s1.length(); i++)
		{
			if( x[i] == '(')
			{
				count1 ++;
			}
			if( x[i] == ')')
			{
				count2 ++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		if (count1 == count2)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
