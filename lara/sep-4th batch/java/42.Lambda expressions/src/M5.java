interface A//interface with only one method is for lamda expressions
{
	void test(int i,double j);
}
class M5
{

	
	public static void main(String[] args)
	{
		 A a1 = (x,y) -> {
							System.out.println("from test:" + x);
							System.out.println("from test:" + y);
							System.out.println("from test:");
						 };
		a1.test(10, 20.6);
		System.out.println("done");
	}
}
