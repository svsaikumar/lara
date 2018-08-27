class M464//removing white spaces in the given sentence 
{
	public static void main(String[] args) 
	{
		



		String s1 =" abc hello java lara";
		System.out.println(s1);

		int index = s1.indexOf(' ');
		while(index  != -1)
		{
			s1 = s1.substring(0, index) + s1.substring(index + 1);
			index = s1.indexOf(' ');
		}
		System.out.println(s1);
	}
}
