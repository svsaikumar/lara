class A
{
	void test()
	{
		System.out.println("A.test()");
	}
	
}
class U extends A 
{
	public void test()
	{
		System.out.println("from subclass.test()");
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//while overriding the access level should be same access or wider access level