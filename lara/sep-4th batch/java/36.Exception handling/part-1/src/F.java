class F 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		String s1 = "hello";


		String s2 = s1.substring(0,6);//it means the characters from 5-10 in the given string has to print
		System.out.println(s2);
		System.out.println("main end");
	}
}
//here we get string index out of bounds exception
