/*getclass method*/
class A
{
	static
	{
		System.out.println("A.SIB");

	}
	void test()
	{
		System.out.println("test");
	}
}
class M4
{
	public static void main(String[] args)
		throws Exception
	{
		System.out.println("main begin");
		Class c1 =Class.forName("A");//A is explicitly loading to the m/y....while it is loading in class.forname...
		System.out.println("------");
		System.out.println(c1);
		System.out.println("--------");
		A a1 = new A();
		a1.test();
		System.out.println("main end");
	}
}
//c1  calling tostring method  i.e overided..it is returning name of the class//
/*output:
main begin
A.SIB
------
class A
--------
test
main end
*/