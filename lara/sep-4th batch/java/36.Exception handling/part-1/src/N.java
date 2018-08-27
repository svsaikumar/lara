class N 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		M obj = new M();

		obj.test();//no such method  error
		System.out.println("main end");
	}
}
