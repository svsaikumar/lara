abstract class B
{
	abstract void test1();
	void test2()
	{
		System.out.println("from B.test2()");
	}
} 
class M9
{
	public static void main(String[] args) 
	{
		B b1 = new B();//object creation to abstract class is illegal.so we get error here
		b1.test2();
		System.out.println("Hello World!");
	}
}
