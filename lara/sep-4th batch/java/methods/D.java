class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test();//calling statement to test method.control going to test method
		
		System.out.println("main end");
	}
	public static void test()//method definition or method implementation
	{
		test(); //here runtime exception will occur
		System.out.println("test()");
	}
}
//if we call a method from that method we wil get run time exception as" stackoverflow"
//defined method can be called ,used, executed throough a calling statement