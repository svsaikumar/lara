class M312 //right rotate by 1
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";



		String s2 = (s1.charAt(s1.length() - 1) + s1).substring(0,s1.length());
		System.out.println(s1);
		System.out.println(s2);//(o + hello).substring(0, 5)
	}
}
//hello
//oHell
//oHello

//Hello
//oellH
//olleh