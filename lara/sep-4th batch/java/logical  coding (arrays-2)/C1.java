import java.util.Arrays;
class C1//quick sort
{
	public static void main(String a[]) 
	{
		int x[] = {10, 2, 25, 3, 15, 6, 18, 12, 20, 4, 1, 22, 14, 8, 24};
		System.out.println(Arrays.toString(x));
		int low = 0;
		int high = x.length -1;
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}

	public static void quickSort(int arr[], int low, int high)
	{
		if (arr == null || arr.length == 0)
		{
			return;
		}//1
		if(low >= high)
		{
			return;
		}//2
		// pick the pivot
		int middle = low + (high - low)/2;
		int pivot = arr[middle];
		//make left < pivot and right > pivot
		int i = low, j = high;
		while( i <= j)
		{
			while(arr[i] < pivot)
			{
				i++;
			}//3
			while(arr[j] > pivot)
			{
				j--;
			}//4
			if(i <= j)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}//5
			//recursively sort two sub parts
			if(low < j)
			{
				quickSort(arr, low, j);
			}//6
			if(high > i)
			{
				quickSort(arr, i, high);
			}//7
		}
	}
}
/*
{10, 2, 25, 3, 15, 6, 18, 12, 20, 4, 1, 22, 14, 8, 24}
pivot = 12;
i = 0;j = 14;
 
 1st while
 ======
 i = 1, i=2,
 j = 13,
 {10, 2, 8, 3, 15, 6, 18, 12, 20, 4, 1, 22, 14, 25, 24}
 i=3;
 j =12;



 2nd
 ====
 i =3,4(++)
 j = 12,11(--),10(--)
 {10, 2, 8, 3, 1, 6, 18, 12, 20, 4, 15, 22, 14, 25, 24}
i = 5
j = 9


3rd
=====
i = 5,6
j = 9
{10, 2, 8, 3, 1, 6, 4, 12, 20, 18, 15, 22, 14, 25, 24}
i =7
j = 8


4th
======
i = 7
j = 7
{10, 2, 8, 3, 1, 6, 4, 12, 20, 18, 15, 22, 14, 25, 24}//same as above
i = 8
j = 6


5th
===
not allowed
*/

