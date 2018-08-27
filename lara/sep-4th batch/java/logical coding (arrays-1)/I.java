import java.util.Arrays;
class I
{
	public static void main(String[] args) 
	{
		int x[] = {10,80,60,90,50,20,70};
		System.out.println("The elements in the array are:"+Arrays.toString(x));
		System.out.print("even indexed elements are:");
		for(int i = 0; i <x.length; i += 2)
		{
			System.out.print(x[i] + ",");
		}
		System.out.println();
		System.out.print("odd indexed elements");
		for(int i = 1; i <x.length; i += 2)
		{
			System.out.print(x[i] + ",");
		}
		System.out.println();

	}
}

