class  F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =5;
		do
		{
			System.out.println(" do while begin:" + i);
			i--;
			if(i > 3)
			{
				System.out.println(" if block:" + i);
				continue;//here the execution goes to the starting of the do while loop
			}
			System.out.println(" do while end:" + i);
		}
		while (i >= 1);
		System.out.println("main end");
	}
}
//after continue ,it goes to the next iteration by checking the boolean condition
//continue and break are only for loops
//without a loop we can't use break and continue
