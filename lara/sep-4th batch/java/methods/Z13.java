class Z13
{
	public static void main(String[] args) 
	{ 
		System.out.println("main begin");
		int i = 10;	// i and j are local to main method
		int j = test(i);//call by value.value of 'i' is sending to test method
		System.out.println("square of " + i + " is " +j);
		System.out.println("main end");
	}
	public static int test(int k)
	{
		int square = k*k;
		return square;//return by value.value  of 'square' is sending to main method		
	}
}

//pass by value
//here while calling test method we are sending primtive int value i(this is called pass by value)
//if it is by derived variable then it is pass by reference
