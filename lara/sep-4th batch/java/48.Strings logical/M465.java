class M465//palindrome or not 
{
	public static void main(String[] args) 
	{
		String s1 = "madam";


		boolean flag = true;
		for(int i = 0; i < s1.length()/2; i++)
		{
				if(s1.charAt(i) != s1.charAt(s1.length() -i -1))
				{
					flag = false;
					break;
				}
		}
		System.out.println("palindrome status of " + s1 + " is:" + flag);
		
	}
}
