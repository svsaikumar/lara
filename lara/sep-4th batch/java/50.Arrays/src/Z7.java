import java.util.Arrays;
class Z7
{
	public static void main(String[] args) 
	{
		int[][] x = new int[4][3];//size of x array is 4
		x[0] [0] = 1;				//every array inside, size is 3
		x[0] [1] = 2; 
		x[0] [2] = 3; 
		x[1] [0] = 4; 
		x[1] [1] = 5; 
		x[1] [2] = 6; 
		x[2] [0] = 7; 
		x[2] [1] = 8; 
		x[2] [2] = 9; 
		x[3] [0] = 10; 
		x[3] [1] = 11; 
		x[3] [2] = 12; 

		for(int i = 0; i < x.length; i++)//this is for array size
		{
			System.out.println(Arrays.toString(x[i]));
		}
	}
}
