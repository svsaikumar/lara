import java.util.Arrays;
class Y//sorting in ascending order
{
	public static void main(String[] args) 
	{
		int x[] = {10, 5 ,9, 14, 23, 2, 0 ,19, 1};
		System.out.println(Arrays.toString(x));
		System.out.println("===============");

		for(int i = 0; i < x.length; i++)
		{
			for(int j = 0; j < x.length-1 -i; j++)
			{
				//if(x[j] < x[j+1])-for descending order
				if(x[j] > x[j+1]) 
				{
					int temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
				System.out.println(Arrays.toString(x));
			}
		}
		System.out.println(Arrays.toString(x));
	}
}
