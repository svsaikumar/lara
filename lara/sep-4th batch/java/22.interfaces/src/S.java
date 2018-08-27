interface A
{
	void test1();
}


class S implements A
{
	public void test1(int i)
	{
		System.out.println("from test-1(int)");
	}
	
	public static void main(String[] args)
	{
		S s1 = new S();
		s1.test1(20);
		System.out.println("done");
	}
}
//the declard method signature and the implemented method signature should be same.so we get error here.
//whenever we are implementing abstract method in subclass signature should be same.
//here inherited method is not implementedin the sub class.it is availlable as it is in subclass.