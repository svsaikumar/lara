import java.util.Arrays;
class X//inserting one array elements in the middle into another array
{
	public static void main(String[] args) 
	{
		int x[] = {10, 20, 3, 4};
		int y[] = {20, 4, 40, 5, 50, 8, 10};
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println("===============");
		int z[] = new int[x.length + y.length];
		for(int i = 0; i < 2; i++)
		{
			z[i] = y[i];
		}

		for(int i = 0; i < x.length; i++)
		{
			z[2 + i] = x[i];
		}

		for(int i = 2; i < y.length; i++)
		{
			z[x.length + i] = y[i];
		}
		System.out.println(Arrays.toString(z));
	}
}
