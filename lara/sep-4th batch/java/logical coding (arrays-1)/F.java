import java.util.Arrays;
class F//to find the min element from the array
{
	public static void main(String[] args) 
	{
		int x[] = {100,80,60,30,50,20,70};
		System.out.println(Arrays.toString(x));
		int min = x[0];
		for(int i = 0; i <x.length; i++)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
		}
		System.out.println(min);
		
	}
}

