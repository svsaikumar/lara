class M 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println("main end:" + i);
	}
	public static int test()
	{
		System.out.println("from test");
		return 10;
	}
}
/*
byte,short,int, long
float, double
char
boolean
*/
//method can have any return type among the above mentioned
//if method type is other than void then there should be a return statement with a value(of same data type) is mandatory