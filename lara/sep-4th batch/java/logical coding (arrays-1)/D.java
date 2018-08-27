import java.util.Arrays;
class D
{
	public static void main(String[] args) 
	{
		int x[] = {10,20,30,40,50,60,70};
		System.out.println(Arrays.toString(x));
		int sum = 0;
		for(int i = 0; i <x.length; i++)
		{
			//sum = sum + x[i];
			sum += x[i];
			count++;
		}
		System.out.println("sum:" + sum);
		
	}
}
//arrays is a built in file which is used to read every element of the array
