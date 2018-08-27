import java.util.Arrays;
class H 
{
	public static void main(String[] args) 
	{


		double[] x = new double[]{10.2, 2.2, 5.4, 4.0};//this approach is recommended
		String[] y = new String[]{"hello", "test", "java"};
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
	}
}
//while definng the array instead of default values, we can give our desired values
//we can specify it by using data type.we should not specify lenght.
//length will be automatically counted by number of elements 