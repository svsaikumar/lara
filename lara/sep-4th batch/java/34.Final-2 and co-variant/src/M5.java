class A
{
	//private int i = 10;
	private final void test1()
	{
	}
}
class  B extends A
{
	//int i = 2;
	void test1()//new method
	{
	}
}
class M5
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//in general, methods will be inherit to subclass
//if method is private then it will not inherit to subclass
//test1 is not available in B class as test1 is private it can't be inherit to subclass
//and test1 is a new method in subclass-B.it is not inherited method