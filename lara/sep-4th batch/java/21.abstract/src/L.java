abstract class A
{
	void test1()
	{
		System.out.println("from A.test1()");
	}
	abstract void test2();

}
abstract class L extends A //here L is concrete sub class
{
	void test2()
	{
		System.out.println("from L.test2()");
	}

	public static void main(String[] args)
	{
		L obj = new L();
		obj.test1();
		System.out.println("==========");
		//obj.test2();
	}
}
//abstract test2 inheriting from A to L
//we can't create object to abstract class,we need to develop concrete sub class to create object
