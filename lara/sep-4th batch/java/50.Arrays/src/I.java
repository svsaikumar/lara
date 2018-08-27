import java.util.Arrays;
class I 
{
	public static void main(String[] args) 
	{
		double[] x = null;//declaring the array

		x = new double[]{10.2, 2.2, 5.4, 4.0};//later defining the content of the array
		String[] y = null;
		y = new String[]{"hello", "test", "java"};
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}
}
//first we can declare and later we can define the content of the array