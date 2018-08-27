class X 
{
	void test(int i)
	{
		System.out.println("X-test(int)");
	}
	void test(double i)
	{
		System.out.println("X-test(double)");
	}
	public static void main(String[] args) 
	{
		X obj = new X();
		obj.test(10);
		obj.test(1.5);
		System.out.println("done");
	}
}
//method over loading is happening here-same name and different signature(eiter no. of args or data type has to vary)
