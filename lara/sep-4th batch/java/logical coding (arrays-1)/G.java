import java.util.Arrays;
class G//to find the max element from the array
{
	public static void main(String[] args) 
	{
		int x[] = {10,80,60,90,50,20,70};
		System.out.println(Arrays.toString(x));
		int max = x[0];
		for(int i = 0; i <x.length; i++)
		{
			if(x[i] > max)
			{
				max = x[i];
			}
		}
		System.out.println(max);
		
	}
}

