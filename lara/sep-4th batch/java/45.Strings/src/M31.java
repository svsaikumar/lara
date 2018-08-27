class M31 
{
	static String reverse(String str)
	{
		if(str.length() == 0)


		{
			return "";
		}
		return str.charAt(str.length() -1) + reverse(str.substring(0, str.length() -1));
	}											//recursive invocation
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = reverse(s1);
		System.out.println(s1);
		System.out.println(s2);
	}
}
//o + Hell
//ol + Hel
//oll + He
//olle + H
//olleH