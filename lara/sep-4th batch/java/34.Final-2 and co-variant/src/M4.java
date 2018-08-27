class A
{
	static final void test1()
	{
	}
	static void test2()
	{
	}
}
class B extends A 
{
	static void test1()
	{
	}

	static void test2()
	{
	}
}
class M4
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//static final is allowed
//static methods can't be overridden
//static methods development is only one time
//while achieving static and final we are achieving avoiding of overrididng
//superclass  telling to subclass don't develop any new method develop my method only incase of static methods
