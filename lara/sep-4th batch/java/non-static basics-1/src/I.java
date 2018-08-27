class  I
{
	void test()
	{
		System.out.println("from test");
	}
	public static void main(String[] args) 
	{
		I obj = new I();//here I contains test method
		obj.test();//calling test with "obj" as reference variable
		System.out.println("done");
	}
}