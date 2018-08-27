import java.util.Arrays;
class M
{
	public static void main(String[] args) 
	{

		int[] x = new int[]{3,4,8,0,12};
		test(x);
		System.out.println("from main:" + Arrays.toString(x));
	}
	static void test(int[] y)
	{
		System.out.println("from test:" + Arrays.toString(y));
		y[2] = 60;//re-assigning a value in array
	}
}
//arrays are oject internally so we need 'new' keyword
//x(from main method) and y(from test method) both are referring to same array object
//object can have any reference variables.all variables can be same methods or from different methods
//changes in the destination reflecting back to				-pass by value
