class M21 
{
	static void test1(Integer obj)
	{
		System.out.println("test1(Integer)");
	}

	public static void main(String[] args) 
	{
		byte b1 = 10;
		test1(b1);//error here
		System.out.println("done");
	}
}
//we are trying to convert byte primitive into Integer wrapper object which is not possible