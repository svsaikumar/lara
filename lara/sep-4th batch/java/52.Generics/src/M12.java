class A < X >
{
	void test(X obj)
	{
	}
}
class M12
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<Integer>();
		A<String> a2 = new A<String>();
		A<Double> a3 = new A<Double>();
		A a4 = new A();
		a1.test(10);
		a2.test("abc");
		a3.test(2.2);
		System.out.println("done");
	}
}
//test() method argument is different for all the 3 objects