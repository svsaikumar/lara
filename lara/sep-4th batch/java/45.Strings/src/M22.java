class M22
{
	public static void main(String[] args) 
	{
		String s1 = new String("Hello");


		System.out.println(s1);

		char[] x = s1.toCharArray();
		for(int i = 0; i< x.length; i++)
		{
			System.out.println(x[i] + ",");
		}
	}
}
//toCharArray() method converts String content into char array