class M27 



{
	public static void main(String[] args) 
	{
		String s1 = new String("HelloHello");
							  //0123456789
		System.out.println(s1);
		int i = s1.indexOf("llo");
		System.out.println(i);
		i = s1.indexOf("Hello");
		System.out.println(i);
		i = s1.indexOf("Hllo");//Hllo is not available in given string so it returns -1
		System.out.println(i);
	}
}
