class A
{
	void test(Integer arg)
	{
	}
}
class M6
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		a1.test(10);
		a2.test(20);
		a3.test(30);
		System.out.println("done");
	}
}
//for every object test() methdo argument data type is fixed(Integer type)