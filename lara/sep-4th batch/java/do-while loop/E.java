class  E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		do
		{
			int i = 1;
			System.out.println("from do while:" + i);
			i--;
		}
		while (i >= 5);//using local variable in boolean condition
		System.out.println("main end");
	}
}
//we can't use local variable of do while loop for the boolean condition of do-while
