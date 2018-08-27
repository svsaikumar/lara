interface A
{
	void test1();
	void test2();
}


class  L implements A
{
	public void test1()
	{
		System.out.println("from L.A-test1()");
	}
	public void test2()
	{
		System.out.println("from L.A-test2()");
	}
	public static void main(String[] args) 
	{
		L l1 = new L();
		l1.test1();
		l1.test2();
		System.out.println("done");
	}
}
//here we can create reference variable to A but we can't create object to A
//every declared method inside interface should be implemented with public outside of the interface(when implementing in concrete sub class of interface)
