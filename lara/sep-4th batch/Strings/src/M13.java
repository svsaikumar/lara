class M13
{
	public static void main(String[] args) 
	{
		String s1 = " abc xyz ";
		int i = s1.length();
		System.out.println(i);
		String s2 = s1.trim();  //new string is assigning to s2
		i = s1.length();
		System.out.println(i);
		i = s2.length();
		System.out.println(i);
		

	}
}
