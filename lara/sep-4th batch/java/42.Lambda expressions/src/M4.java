interface A//interface with only one method is for lamda expressions
{
	void test(int i);
}
class M4
{
	public static void main(String[] args)
	{
		A a2 = (x) -> {
								System.out.println("from test:" + x);
								System.out.println("from test:" + x);
								System.out.println("from test:" + x);
						  };
		a2.test(10);
		System.out.println("done");
	}
}
//if there is only one method then there is no need to specify datat type of the argument