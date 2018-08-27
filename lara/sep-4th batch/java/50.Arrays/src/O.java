import java.util.Arrays;
class O 
{
	public static void main(String[] args) 
	{

		int[] x = new int[4];
		int[] y = x;

		int[] z = y;
		y[2] = 100;
		System.out.println(x[2]);
		System.out.println(y[2]);
		System.out.println(z[2]);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(z));
	}
}
//all varaibles x,y,z are refering to same object
//if changes are made by using one variable it will to all other remaining varaibles
