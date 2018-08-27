class A
{
	void test()
	{
		System.out.println("A.test()");
	}
	
}
class T extends A 
{
	int test()//overriding
	{
		System.out.println("from subclass.test()");
		return 10;
	}
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//while overriding(for implementation also), the return type should be same.here it is not following that so we get CTE