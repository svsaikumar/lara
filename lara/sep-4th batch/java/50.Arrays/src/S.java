import java.util.Arrays;
class S 
{
	public static void main(String[] args) 
	{

		int[] x = {10,4,20,6,30,8,25,15};
		char [] y = {'p','b', 'a', 'z'};

		String [] z = { "abc", "def"};
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(z));

		Arrays.sort(x);//built in method for sorting the array content in ascending order
		Arrays.sort(y);
		Arrays.sort(z);

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(z));
	}
}
//for sorting the arrays, there is a built in method.