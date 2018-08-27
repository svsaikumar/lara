class  A
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i =1;
		do
		{
			System.out.println("from do while:" + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end");
	}
}
//variable has to be declared before the do-while loop
//boolean condition should after the body
//do-while loop has to end with a semi-colon
//do-while loop is different from for and while loop
//for the first time the boolean condition is ignored
//from second time it  checks the boolean condition