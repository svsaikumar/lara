class A 
{
	void test1()
	{
	}
}
class B extends A
{
	@Override
	void test1()
	{
	}

	//@Override
	void test2()
	{
	}
}
class M16
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}

//only overrided methods are described with @Override
//@Override is built in annotation(no need of import statement)