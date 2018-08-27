abstract class A
{
	void test1()
	{
		System.out.println("from A.test1()");
	}
	abstract void test2();
	abstract void test3();

}
abstract class B extends A//B is sub class to A
{
	void test2()
	{
		System.out.println("from B.test2()");
	}
}
class M extends B //here M is concrete sub class to B
{
	void test3()
	{
		System.out.println("from M.test3()");
	}

	public static void main(String[] args)
	{
		M obj = new M();
		obj.test1();
		System.out.println("==========");
		obj.test2();
		System.out.println("==========");
		obj.test3();
	}
}
//here we have to declare B as absract becaues it contains one of the inherited abstract method
//here we didn't use abstrat for M as it is extended fro B class which has no abstracts methods