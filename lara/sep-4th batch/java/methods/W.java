class W 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("========");
		int i = test1() + test2();//i=300 + 200=500
		System.out.println("========");

		test2();
		System.out.println("========");
		System.out.println(i + test1() + test2());//500+300+200=1000
		System.out.println("==========");
		System.out.println("main end");
	}
	public static int test1()
	{
		System.out.println("from test-1");
		return (100 + test2());
	}
	public static int test2()
	{
		System.out.println("from test-2");
		return 200;
	}
}
/*
main begin
from test1
ft 2
===============
=============
ft 2
===========
1000
==========
maih end
*/




