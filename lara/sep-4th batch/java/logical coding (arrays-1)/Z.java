import java.util.Arrays;
class Z//printing the missing the values between min and max values of the array
			//(excluding the values which are present in the array)
{
	public static void main(String[] args) 
	{
		int x[] = {20, 4, 8, 5, 9, 10};
		System.out.println(Arrays.toString(x));
		System.out.println("===============");

		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x.length-1 -i; j++)
			{
				if(x[j] > x[j+1])
				{
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(x));
		int min = x[0];
		for(int i = 1; i < x.length; i++)
		{
			if(x[i] > (min + 1))
			{
				for(int j = min + 1; j < x[i]; j++)
				{

					System.out.print(j + "," );
				}
			}
			min = x[i];
		}
		System.out.println();
	}
	
}
