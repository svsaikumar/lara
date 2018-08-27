class M317//reversing the words
{

	static String s1,s2;
	static int i,j, count,length;

	
	public static void test()
	{

		i = s1.indexOf(' ');
		count = 1;
		while(i != -1)
		{
			count ++;
			i = s1.indexOf(' ', i+1);
		}
	}
	public static void main(String[] args) 
	{
			s1 = "Hello test java world lara kumar yadav";
			length = s1.length();
			int l = 0;
			System.out.println(s1);
			test();
			//for(int k = 0; k < count;k++)
			while( j != -1)
			{
				j = s1.lastIndexOf(' ',length);//26//21//
				s2 = s2 +' ' + s1.substring(j +1, (length + l));
				length = j - 1;//25//20//
				l = 1;	
			}
			int m = s2.indexOf(' ');
			System.out.println(s2.substring(m +1, s2.length()));
	}
}
//651 lara world java test Hello

/*			s2 = s1.substring(0, s1.indexOf(' '));

			String s3 = s1.substring(s1.lastIndexOf(' '), s1.length());

			String s4 = s3 + ' ' + (s1.substring(s1.indexOf(' ') +1, s1.lastIndexOf(' ')) +' ' + s2);

			System.out.println(s4);
			*/