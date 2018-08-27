class M12 
{
	static void test(D obj)
	{
	}
	public static void main(String[] args) 
	{
		A a1 = new E();
		test(a1);
		B b1 = a1;
		test(b1);
		C c1 = a1;
		test(c1);
		System.out.println("done");
	}
}
