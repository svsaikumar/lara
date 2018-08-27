import java.util.Arrays;
class Z9
{
	public static void main(String[] args) 
	{


		int x [][] = new int[4][];//here only we have to initialize values
		//x [0] = {10, 20, 30 };
		//x [1] = {40, 50, 60,20 };
		//x [2] = {70, 80, 90 };
		x [3] = new int[3];
		
		for(int i = 0; i < x.length; i++)
		{
			System.out.println(Arrays.toString(x[i]));
		}
	}
}
//at the place of declaratin only we have to initialize arrays values
//the default values of multi dimensional arrays is null
//but for inner array the defalut values based on the data type of that inner array(as there are one dimensional arrays)