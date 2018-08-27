abstract class A
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}
abstract class B extends A
{
	void test1()
	{	
		System.out.println("from B.test1()");
	}
}
abstract class C extends B
{
	void test2()
	{
		System.out.println("from C.test2()");
	}
}
class D extends C
{
	void test3()
	{
		System.out.println("from D.test3()");
	}
}
class O 
{
	public static void main(String[] args)
	{
		//A a1 = new A();
		//B b1 = new B();
		//C c1 = new C();
		D d1 = new D();
		d1.test1();
		d1.test2();
		d1.test3();
		System.out.println("done");
	}
}
//even abstract class also can have constructer.it not compiler will develop a default no arg constructer.
//that constructer will execute when obj is created in concrete subclass of abstact class, then it will execute by defalut super calling statement
//it is possible to develop  any number of constructers, if not  compiler will develop a default no arg constructer.