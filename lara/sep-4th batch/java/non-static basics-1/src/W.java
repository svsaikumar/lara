class W 
{
	int i ;
	static void test(W obj1, W obj2)//obj is local to test method
	{
		System.out.println("from test-1:" + obj1.i);
		System.out.println("from test-2:" + obj2.i);
		obj1.i = 20;
		System.out.println("from test-3:" + obj1.i);
		System.out.println("from test-4:" + obj2.i);
		obj2.i = 30;
		System.out.println("from test-5:" + obj1.i);
		System.out.println("from test-6:" + obj2.i);
		obj2.i = 40;
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		W w1 = new W();
		W w2 = new W();
		w1.i = 5;
		w2.i = 15;
		test(w1, w2);
		System.out.println("main end:" + w1.i);
		System.out.println("main end:" + w2.i);
	}
}
//