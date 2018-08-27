class M33 
{
	public static void main(String[] args) 
	{
		String s1 = "bac;hello;test;123;xyz";


		String[] strings = s1.split(";");
		for(String str : strings)
		{
			System.out.println(str);
		}
	}
}
//split method taking one separator and splitting the string based on that separtor