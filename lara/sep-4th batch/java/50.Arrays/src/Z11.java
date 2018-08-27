import java.util.Arrays;
class Z11
{
	public static void main(String[] args) 
	{


		int  []x[] =   {{10, 20, 30 },
						{40, 50, 60,20 },
						{70, 80, 90 },
						{110},
						{}};
		
		System.out.println(x[3][0]);
		System.out.println(x[4][0]);//this is error as there are no elements in the array.we can't even have 0 index also
		
	}
}
//at the place of declaratin only we have to initialize arrays values
//forth element containing only one element with index-0, but we are supplying index-1.so we get exception