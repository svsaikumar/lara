abstract class A
{
	abstract void test();//abstract method
	
}
class S extends A 
{
	void test(int i)//concrete method
	{
		System.out.println("from subclass.test(int)");
	}
	public static void main(String[] args) 
	{
		S obj = new S();
		obj.test();
		System.out.println("done");
	}
}
//while implementing superclass in subclass there should be same signature