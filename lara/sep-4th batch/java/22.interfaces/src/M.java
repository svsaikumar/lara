interface A
{
	void test1();
	void test2();
}

abstract class B implements A//test2() of A which is not implemented in B so we have to use abstract for class B
{
	public void test1()
	{
		System.out.println("from B-test1()");
	}
	
}
class  M extends B//here there are no further implementation metods .so abstract is optional
{
	public void test2()
	{
		System.out.println("from B-test2()");
	}
	public static void main(String[] args) 
	{
		M obj = new M();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
//class to class is extends
//class to interface is implements
//here we can't create objects to A and B(as they are interface and abstract).only for M is allowed as it is not abstract