class D
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for(; ; )//valid
		{
			//System.out.println(i);
			 i++;
		}
		//System.out.println("main end");//unreachable statement
		
	}
}
//for loop empty arguement is always true
