import java.util.Arrays;
class H
{
	public static void main(String[] args) 
	{
		int x[] = {10,80,60,90,50,20,70};
		System.out.println("The elements in the array are:"+Arrays.toString(x));
		System.out.println();
		System.out.println("First element is:" + x[0]);
		System.out.println();
		System.out.println("Last element is:" + x[x.length-1]);
		System.out.println();
		System.out.println("middle element is:" + x[x.length/2]);
		System.out.println();
		
		int min = x[0];int max = x[0];int sum =0;
		for(int i = 0; i <x.length; i++)
		{
			if(x[i] < min)
			{
				min = x[i];
			}
			if(x[i] > max)
			{
				max = x[i];
			}
			sum += x[i];
		}
		double avg = (double) sum/ x.length;
		System.out.println("min element is:" +min);
		System.out.println();
		System.out.println("max element is:" + max);
		System.out.println();
		System.out.println("sum is:" + sum);
		System.out.println();
		System.out.println("avg is:" + avg);
		System.out.println();
		
	}
}
/*
read and print 1st element
read and print last element
read and print middle element
read and print min element
read and print max element
read and print sum of all elements
find out avg value of all elements
*/

