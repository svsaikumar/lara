interface  B
{
	static void test()
	{
		System.out.println("A_test()");
	}
}
class M4 implements B
{
	public static void main(String[] args) 
	{
		//B.test(); //this is correct 
		M4.test();//error here
		System.out.println("done");
	}
}
//the unavoidable(static defined method) implementation is limited to current interface only
//