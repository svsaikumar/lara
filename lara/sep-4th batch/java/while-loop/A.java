class  A
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		int i = 1;
		while(i < 5)//it will repeat until condition fails
		{

			System.out.println("while-body:" + i);
			i++;
		}

		System.out.println("main-end");
	}
}
//before while loop we can declare the variable which is going to use for the while condition
//increment or decrement can be any where in the body
//intialization should be before while loop
//boolean condition should be in the while loop

//while and for loops are almost same