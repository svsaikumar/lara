class M12
{
	public static void main(String[] args) 
	{
		String s1 = " abc xyz ";
		int i = s1.length();
		System.out.println(i);
		//System.out.println(s1);

		
		s1 = s1.trim();// or s2 = s1.trim();s1 is pointing to new String object
		i = s1.length();
		System.out.println(i);
		System.out.println(s1);

	}
}
//trim removes leading and  ending  white spaces of the string
//before 'a' and after 'z' white spaces are removed