class M316+//right shift by one word 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello test java world lara 651";

		String lastword = s1.substring(s1.lastIndexOf(' ') + 1);
		String s2 = (lastword + " " + s1).substring(0, s1.lastIndexOf(' '));

		System.out.println(s1);
		System.out.println(s2);
	}
}
