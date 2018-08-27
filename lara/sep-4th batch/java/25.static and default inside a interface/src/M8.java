interface A
{
	default void test()
	{
		System.out.println("from A.test()");
	}
}
interface B
{
	default void test()
	{
		System.out.println("from B.test()");
	}
}
class C implements A,B
{
}
class M8
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.test();
		System.out.println("done");
	}
}
//A is independent interface and B is also a independent interface
//there are 2 default test methods in class C.compiler will not allow 2 default methods 
//from 2 different interfaces inherinting in one class with same signsture which ambuigity.so we get error
