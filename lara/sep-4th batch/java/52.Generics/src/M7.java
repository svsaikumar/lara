class A
{
	void test(Integer arg1, String arg2)
	{
	}
}
class M7
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.test(10, "abc");
		a2.test(20, "def");
		a3.test(30, "hij");
		System.out.println("done");
	}
}
//for every object test() methdo argument data type is fixed(Integer type, String type)
//Object to Object unable to change the data type