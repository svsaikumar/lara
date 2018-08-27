import java.util.Arrays;
class K
{
	public static void main(String[] args) 
	{

		int[] x = new int[5];//array with data type
		int[] y = new int[] {12,4,6};//array with data type and desired values
		int[] z ={12, 4, 6};//array with desired values
		test(x);
		test(y);
		test(z);
	}
	static void test(int[] array)
	{
		System.out.println("from test:" + Arrays.toString(array));
	}
}