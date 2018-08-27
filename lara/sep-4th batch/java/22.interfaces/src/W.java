class V 
{
	void test()
	{
		System.out.println("V-test()");
	}
}
class W extends V
{
	void test(int i)
	{
		System.out.println("W-test(int)");
	}
	public static void main(String[] args)
	{
		W w1 = new W();
		w1.test();
		w1.test(20);
		System.out.println("done");
	}
}
//here W class contains 2 methods with different signature.over loading is happening here
//method over loading-same name but different signature