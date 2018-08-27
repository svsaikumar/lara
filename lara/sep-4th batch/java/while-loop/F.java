class F
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		int i = 10;
		while(i-- > 5);//while loop ends here only


		{
			System.out.println("while-body:" + i);
			
		}

		System.out.println("main-end");
	}
}