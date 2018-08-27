interface A
{
	void test1();
}
interface B
{
	void test2();
}
class P implements A,B
{
	public void test1()
	{
		System.out.println("from test-1");
	}
	public void test2()
	{
		System.out.println("from test-2");
	}
	public static void main(String[] args)
	{
		P p1 = new P();
		p1.test1();
		p1.test2();
		System.out.println("done");
	}
}
//a class can implement with any number of super interfaces.
//multiple inheritance is possible only through interfaces in java(in c++ it is possible with classes also)
//a class can extend with only one class."extends" with more than one class is not possible