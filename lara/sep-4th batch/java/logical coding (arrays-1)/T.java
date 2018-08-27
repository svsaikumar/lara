import java.util.Arrays;
class T//for printing the common elements
{
	public static void main(String[] args) 
	{
		int x[] = {10, 10, 12, 30, 4, 60, 7, 80};
		int y[] = {10, 30, 7, 90};
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		int size = x.length; 
		boolean flag = true;
		for(int i = 0; i< size; i++)// for y elements purpose
		{
			for(int j =0; j < y.length; j++)//for x elements purpose
			{
				if(x[i] == y[j])
				{
					flag = false;
					break;
				}
			}
				if(flag)
				{
					for(int k = i; k < size-1; k++)
					{
						x[k]= x[k+1];
					}
					i--;
					size--;
				}
				flag = true;
		}
		int z[] = new int[size];
		for(int i = 0; i< size; i++)
		{
			z[i] = x[i];
		}

		System.out.println("===================");
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(z));
		System.out.println(Arrays.toString(y));


		
	}
}