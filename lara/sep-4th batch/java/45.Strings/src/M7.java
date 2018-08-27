class M7
{
	static String s1 = null;
	public static void main(String[] args) 
	{


		String s1 = null;
		int i = s1.length();
		System.out.println(i);
		System.out.println(M7.s1);
	}
}
//we can assign a null value to String.
//we will get an exception if we try to find the length of a null value incase of Strings
//we should not call any method from a null reference(we will get a null pointer exception)