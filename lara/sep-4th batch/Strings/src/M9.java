class M9
{
	public static void main(String[] args) 
	{
		String s1;//s1 should not be used without initialization as it is a local variable.so we get error
		int i = s1.length();
		System.out.println(i);

	}
}