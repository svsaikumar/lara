//package pack1;
class I 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert true : test();
		System.out.println(test());
		System.out.println(2);
	}

	static boolean test()
	{
		return true;
	}
}
//aftr colon we  provide somethig which is returning a value(it should not be void)
