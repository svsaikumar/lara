import java.util.Arrays;
class U//for printing the common elements in a new array
{
	public static void main(String[] args) 
	{
		int x[] = {10, 20, 3, 4,50, 6, 70, 8, 1, 4, 2};
		int y[] = {20, 4, 40, 5, 50, 8, 10};
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println("=================");
		int size = x.length > y.length ? y.length : x.length;
		int z[] = new int[size];
		boolean flag = false;
		int found = 0;
		for(int i = 0;i <x.length; i++)
		{
			for(int j= 0; j <y.length; j++)
			{
				if(x[i] == y[j])
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				boolean availability = false;
				for(int k = 0; k < found; k++)
				{
					if (x[i] == z[k])
					{
						availability = true;
						break;
					}
				}
				if(!availability)
				{
					z[found ++] = x[i];
				}
			}
			flag = false;
		}
		int z1[] = new int[found];
		for(int i = 0; i < found; i++)
		{
			z1[i] = z[i];
		}
		System.out.println(Arrays.toString(z));
		System.out.println(Arrays.toString(z1));
	}
}
