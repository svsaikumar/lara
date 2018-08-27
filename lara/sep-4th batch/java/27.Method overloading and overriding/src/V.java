class A
{
	protected void test()
	{
		System.out.println("A.test()");
	}
}
class V extends A 
{
	void test()
	{
		System.out.println("from subclass.test()");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//while overriding narrower access level is not allowed
//here default is narrow than protected