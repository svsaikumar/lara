import java.util.Arrays;
class L
{
	public static void main(String[] args) 
	{

		test(new int[9]);

		test(new int[]{3,4,5,6});
		//test({3,4,5});//error here-we are not specifying the data type
	}
	static void test(int[] array)
	{
		System.out.println("from test:" + Arrays.toString(array));
	}
}
//without data type we can't provide list of values while writing separately
//declaring array in the paranthesis of test method
//defining array values while calling test method