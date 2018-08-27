import java.util.Arrays;
class L
{
	public static void main(String[] args) 
	{
		int x[] = {10,80,60,90,50,20,70};
		System.out.println(Arrays.toString(x));
		int temp;
		for(int i = 0; i < x.length-1; i +=2)
		{
			temp = x[i];
			x[i] = x[i +1];
			x[i + 1] = temp;
		}
		System.out.println(Arrays.toString(x));
		

	}
}

