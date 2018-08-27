class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1 = null;


		int i = s1.length();//null pointer exception
		System.out.println("main end");
	}
}
