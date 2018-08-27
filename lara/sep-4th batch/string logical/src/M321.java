//to find length of the String without using length() method
import java.util.Arrays;
class M321 
{
	

	public static void main(String[] args) 
	{
		int p =0; String q = null;String t = null, z = null;String r = null;
			String s = "hello world lara java test sai kumar yadav";
			int sl = s.length();
			System.out.println(s);
			char[] x = s.toCharArray();

			for(int i = x.length-1; i >= 0;i--)
			{
				if(x[i] == ' ')
				{
					p = s.lastIndexOf(x[i]);
					r = s.substring(0,p);
					q = s.substring(p+1, sl);
					r = q +' '+ r;
					System.out.println(r);
					break;
				}
			}
	}
}

			/*int count = 1;
			String s = "hello world lara java test";
			char[] x = s.toCharArray();
			//System.out.println(x);
			for(int i = 0; i < x.length;i++)
			{
				if(x[i] == ' ')
				{
					count++;
				}
			}
			System.out.println(s);
			System.out.println("number of words is " + count);
			*/


	/*String s = "Hello";
		s +="x";
		int i =  s.lastIndexOf('x');
		System.out.println(i);
		*/


	/*Strig s = "Hello";
	char[] x = s.toCharArray();
	System.out.println(x.length);
	*/

		/*String s = "Hello";
		char x = s.charAt(s.length()-1);
		System.out.println(x);
		s = x + s;
		System.out.println(s.substring(0,(s.length()-1)));
		*/
