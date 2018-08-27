interface A//interface with only one method is for lamda expressions
{
	void test(int i);
}




class M3
{
	public static void main(String[] args)
	{
		A a2 = (int x) -> {
								System.out.println("from test:" + x);
								System.out.println("from test:" + x);
								System.out.println("from test:" + x);
						  };
		a2.test(10);
		System.out.println("done");
	}
}
 