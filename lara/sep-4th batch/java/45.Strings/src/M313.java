class M313 //left rotate by 1
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";

		

		String s2 = (s1 + s1.charAt(0)).substring(1,s1.length() +1);//(1,6)
		System.out.println(s1);
		System.out.println(s2);//Hello + H//(HelloH).substring(1,6)
	}
}