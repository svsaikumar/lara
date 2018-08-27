interface A
{
	default void test()
	{
		System.out.println("from A.test()");
	}
}
interface B extends A
{
}
class C implements B
{
}
class M7
{
	public static void main(String[] args) 
	{
		C  c1 = new C();
		c1.test();
		System.out.println("done");
	}
}
//any common implementation which is required to every subclass or sub interfaces
//that can be implemented in the interface be using default method
//non static methods should be implemented in the interface with a default
//