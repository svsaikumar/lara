import java.util.Arrays;
class M//reversing content of the array
{
	public static void main(String[] args) 
	{
		int x[] = {10,80,60,90,50,20,70};
		System.out.println(Arrays.toString(x));
		int temp;int j = x.length;
		for(int i = 0; i < x.length/2; i++)
		{
			temp = x[i];
			x[i] = x[j - 1 -i];
			x[j -1 -1] = temp;
		}
		System.out.println(Arrays.toString(x));
		

	}
}

