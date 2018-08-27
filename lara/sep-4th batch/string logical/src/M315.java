class M315//left shift by one word 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello test java world lara 651";



		String firstword = s1.substring(0,s1.indexOf(' '));//0,5//firstword = Hello
		String s2 = (s1 + ' ' + firstword.substring(s1.indexOf(' ') + 1);

		System.out.println(s1);
		System.out.println(s2);
	}
}
//(Hello test java world lara 651 Hello).6
//test java world lara 651 Hello
