class G 
{
	static 
	{
		System.out.println("sib-g");
	}

	static void test1()
	{
		System.out.println("from G-test-1");

	}
	static void test2()
	{
		System.out.println("from G- test-2");

	}
}
class I extends G
{
	static 
	{
		System.out.println("sib-i");
	}
	static void test2()
	{
		System.out.println("from I -test-2");

	}
	
}
class H extends I
{
	public static void main(String[] args) 
	{
		//H.test1();//here using " H." is optional as test1() is static
		I.test2();//here using " H." is optional as test2() is static
		System.out.println("done");
	}
}
//G class test1 also available in H class