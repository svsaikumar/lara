abstract class A
{
	void test1()
	{
		
	}

	abstract void test2();
}
class G
{
	public static void main(String[] args)
	{
		A a1 = new A();//error here
		//G g1 = new G();this is allowed
		System.out.println("done");
	}
}
