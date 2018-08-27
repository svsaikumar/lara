import java.util.Arrays;
class W//adding the one array elements to another array in a new array
{
	public static void main(String[] args) 
	{
		int x[] = {10, 20, 3, 4};
		int y[] = {20, 4, 40, 5, 50, 8, 10};
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println("===============");
		int z[] = new int[x.length + y.length];
		for(int i = 0; i < y.length; i++)
		{
			z[i] = y[i];
		}

		for(int i = 0; i < x.length; i++)
		{
			z[y.length + i] = x[i];
		}
		System.out.println(Arrays.toString(z));
	}
}
