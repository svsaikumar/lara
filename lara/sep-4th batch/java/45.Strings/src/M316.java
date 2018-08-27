class M316//right shift by one word 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello test java world lara 651";

		String lastword = s1.substring(s1.lastIndexOf(' ') + 1);
		String s2 = lastword + " " + s1;
		s2 = s2.substring(0, s2.lastIndexOf(' '));

		System.out.println(s1);
		System.out.println(s2);
	}
}
//Hello test java world lara 651
//651 = lastword
//651 Hello test java world lara 651 = s2
//651 Hello test java world lara
