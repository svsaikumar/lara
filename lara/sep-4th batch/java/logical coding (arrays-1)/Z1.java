//occurances elements
import java.util.Arrays;
class Z1
{
	public static void main(String[] args) 
	{
		int x[] = {20, 4, 8, 5, 18, 8, 4, 5, 8, 20};
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
		int count = 1;
		for(int i = 0; i < x.length-1; i++)
		{
			if(x[i] == x[i + 1])
			{
				count ++;
			}
			else
			{
				System.out.println(x[i] + ":" + count);
				count = 1;
			}
		}
		System.out.println(x[x.length - 1] + ":" + count);
	}
}
	

