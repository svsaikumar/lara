import java.util.Arrays;
class G 
{
	public static void main(String[] args) 
	{
		double[] x = {10.2, 2.2, 5.4, 4.0};
		String[] y = {"hello", "test", "java"};
		
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
	}
}
//while definng the array instead of default values, we can give our desired values
//without metioning the size ,we are directly giving the array values
//so the array size is automatically develop based on the number of elements assigning