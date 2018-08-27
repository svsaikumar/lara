import java.util.Arrays;
class Z8
{
	public static void main(String[] args) 
	{


		int x [][] = new int[4][];//size of x array is 4
		x [0] = new int[3];
		x [1] = new int[2];
		x [2] = new int[6];
		x [3] = new int[9];
		for(int i = 0; i < x.length; i++)
		{
			System.out.println(Arrays.toString(x[i]));
		}
	}
}
//here array is of type object so by default null is stored in it