class G 
{
	void test()
	{
	}

	static  
	{
		System.out.println("SIB-begin");
		test();
		System.out.println("SIB-end");
	}
}
//we can't call a non-static  from a satic  straight away