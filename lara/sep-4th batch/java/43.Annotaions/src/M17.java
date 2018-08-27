class A 
{
	@Deprecated//built in annotaion
	void test1()
	{
	}
	void test2()
	{
	}
	
}
class M17
{
	//@SuppressWarnings("deprecation")//built in annotation
	public static void main(String[] args)
	{
		A a1 = new A();
		a1.test1();
		a1.test2();
		System.out.println("Hello World!");
	}
}

//@Deprecated = old or legacy.not advisabe to use.after findinng a new way of development
//for deprecated, compiler gives warning only but not error

//@SupressWarnings