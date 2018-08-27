import java.util.Arrays;
class Q//left rotate by one place
{
	public static void main(String[] args) 
	{
		int x[] = {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(x));
		int temp = x[0];
		for(int i =0; i < x.length-1;i++)
		{
			x[i]= x[i+1];
		}
		x[x.length-1]= temp;
		System.out.println(Arrays.toString(x));
	}
}
// left rotate is to be from right end only
