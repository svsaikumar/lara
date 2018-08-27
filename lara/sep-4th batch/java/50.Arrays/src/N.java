import java.util.Arrays;
class N
{
	public static void main(String[] args) 
	{

		int[] x = new int[5];//no ref for this object after executing the below 2 statements
		int[] y = new int[10];
		
		x = y;
		y = x;//no effect
		System.out.println("from main:" + Arrays.toString(x));
		System.out.println("from main:" + Arrays.toString(y));
		System.out.println("done");
	}
}
//x and y data types are equal
//x is int array data type and y is also int array data type
//compiler checkes the data types but not the the size of the array