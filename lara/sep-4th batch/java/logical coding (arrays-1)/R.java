import java.util.Arrays;
class R//removing duplicate elements from the array
{
	public static void main(String[] args) 
	{

		int x[] = {10,10,20,30,40,50,30,60,70,80,70,90,10};
		System.out.println(Arrays.toString(x));
		int size = x.length;//int count = 0;
		for(int i = 0; i < size; i ++)
		{
			for(int j =i + 1; j < size; j++)
			{
				if(x[i] == x[j])
				{
					for(int k =j; k < size-1; k++)
					{
						x[k] = x[k+1];	//removing duplicates from the array
						System.out.println(Arrays.toString(x));
					}
					j--;
					size--;//count++;
				}
			}
		}
		System.out.println(Arrays.toString(x));
		
		int y[]= new int[size];
		for(int i = 0; i< size; i++)
		{
			y[i] = x[i];
		}
		System.out.println(Arrays.toString(y));
	}
}
 //we can't remove the elements from the array but we can reduce the size of the  array

