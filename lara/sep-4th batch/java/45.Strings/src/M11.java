class M11
{
	public static void main(String[] args) 
	{
		String s1 = " abc xyz ";


		int i = s1.length();
		System.out.println(i);
		System.out.println(s1);
		String s2 = s1.trim();
		i = s1.length();
		//System.out.println(i);
		System.out.println(s2);
		System.out.println(s2.length());

	}
}
//trim() removes leading and ending white spaces of the string
//before 'a' and after 'z' white spaces are removed
//if we modify String object, then with that modification new object is creating bot not modifying the previous String object
