class A 
{
	void test1()
	{
	}

	final void test2()
	{
	}
}
class B extends A
{
	void test1()//we can override test-1 as it is not final
	{
	}

	void test2()//we can't override test-2 as it is final.error
	{
	}
}
class M1
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//final keyword is not only for variables but also for methods
//we can't override final methods
//we can use final methods without modifying or overriding in the subclass