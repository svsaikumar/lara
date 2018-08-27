import java.util.Arrays;
class P//left shift by one place
{
	public static void main(String[] args) 
	{
		int x[] = {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(x));
		for(int i =0; i < x.length-1;i++)
		{
			x[i]= x[i+1];
		}
		System.out.println(Arrays.toString(x));
		

	}
}
// left shift is to be from left end only
