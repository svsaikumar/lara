class  F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		while(true)
		{
			System.out.println("while body");
		}
		System.out.println("main end");//unreachable statement
	}
}
//we can't supply a blank to while loop in argument,if so we get error
//but in the case of for loop it can be empty