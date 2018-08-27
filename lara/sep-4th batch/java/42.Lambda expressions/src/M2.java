interface A//interface with only one method is for lamda expressions
{
	void test();
}
class M2
{
	public static void main(String[] args)
	{
		A a2 = new A() -> {
								System.out.println("from test");
								System.out.println("from test");
								System.out.println("from test");
								System.out.println("from test");
						  };
		a2.test();
		System.out.println("done");
	}
}
//lamda expression should end with a semi colon similar to anonymous inner class
//class file is not developing lambda expressions
//if there is only one line statemetn in lambda expressions then there is no need to put open and closing braces
//if multiple statmetns then braces are required