class F 
{
	int i = 100;
	static  
	{
		System.out.println("SIB-begin");
		System.out.println(i);
		System.out.println("SIB-end");
	}
}
//we can't call a non-static  from a satic  straight away