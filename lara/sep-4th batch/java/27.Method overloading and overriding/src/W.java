class A
{
	void test()
	{
		System.out.println("A.test()");
	}	
}
class W extends A 
{
	static void test()
	{
		System.out.println("from subclass.test()");
	}
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
//overriding of static with non-static or vice-versa is not allowed.so we get CTE here.