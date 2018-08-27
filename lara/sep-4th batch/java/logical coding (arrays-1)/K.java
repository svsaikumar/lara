import java.util.Arrays;
class K
{
	public static void main(String[] args) 
	{


		int x[] = {10,80,60,90,50,20,70};//7
		//			0  1  2  3  4  5  6
		System.out.println("The elements in the array are:"+Arrays.toString(x));
		System.out.print("The even indexed elements in reverse order are:");
		for(int i = (x.length) % 2 !=0 ? x.length -1: x.length-2; i>=0; i -=2)
		{
		
			System.out.print(x[i] + ",");
		}
		System.out.println();
		System.out.print("The odd indexed elements in reverse order are:");
		for(int i = (x.length) % 2 ==0 ? x.length -1: x.length-2; i>=0; i -=2)
		{
		
			System.out.print(x[i] + ",");
		}
		System.out.println();
		System.out.println(Arrays.toString(x));
		

	}
}

