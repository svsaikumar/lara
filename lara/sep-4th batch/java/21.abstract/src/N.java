abstract class A
{
	void test1()
	{
		System.out.println("from A.test1()");
	}
	abstract void test2();
	abstract void test3();

}
class B extends A//B is sub class to A.This class B should be declared as abstract.
{
	void test2()
	{
		System.out.println("from B.test2()");
	}
}
class N extends B //here M is concrete sub class to B
{
	void test3()
	{
		System.out.println("from N.test3()");
	}

	public static void main(String[] args)
	{
		N obj = new N();
		obj.test1();
		System.out.println("==========");
		obj.test2();
		System.out.println("==========");
		obj.test3();
	}
}
//here we have to declare B as absract becaues it contains one of the inherited abstracat method.so we get error here
//here we didn't use abstrat for N as it is inherited from B class which has no abstracts methods