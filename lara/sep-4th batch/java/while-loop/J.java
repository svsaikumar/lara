class J
{
	public static void main(String[] args) 
	{
		System.out.println("main-begin");
		int i = 10;
		while(i-- > 1)
		{
			System.out.println("while-body begin:" + i);
			if(i > 5)
			{

				System.out.println("if body :" + i);
				break;//here it comes out of the while loop
			}
		
			System.out.println("while-body end:" + i);
		}
		System.out.println("main-end");
	}
}