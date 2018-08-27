class E 
{
	int i = 100;
	static void test1() 
	{
		System.out.println("test begin");
		//E e1 = new E();
		//System.out.println(e1.i);
		System.out.println(i);
		System.out.println("test end");
	}
}
//we can't call a non-static  from a static  straight away