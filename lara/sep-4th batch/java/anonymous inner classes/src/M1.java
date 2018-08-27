class A
{
	void test()
	{
		System.out.println("A.test");
	}

}
class  M1
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.test();
		System.out.println("done");
	}
}
