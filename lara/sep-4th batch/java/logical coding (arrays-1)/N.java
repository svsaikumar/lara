import java.util.Arrays;
class N//right shift by one place
{
	public static void main(String[] args) 
	{
		int x[] = {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(x));
		for(int i = x.length -1; i > 0;i--)
		{
			x[i]= x[i -1];
		}
		System.out.println(Arrays.toString(x));
		

	}
}

//right shift has to be done from right end only