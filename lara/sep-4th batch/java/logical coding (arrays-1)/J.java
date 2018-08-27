import java.util.Arrays;
class J
{
	public static void main(String[] args) 
	{
		int x[] = {10,80,60,90,50,20,70};
		System.out.println("The elements in the array are:"+Arrays.toString(x));
		System.out.print("The elements in reverse order are:");
		for(int i = x.length-1; i >=0; i--)
		{
			System.out.print(x[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(x));
		

	}
}

