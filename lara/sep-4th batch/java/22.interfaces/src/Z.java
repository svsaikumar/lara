class A
{
	
	void test(int i)
	{
		System.out.println("A-test(int)");
	}
}
class  B extends A
{
	void test(int j)
	{
		System.out.println("B-test(int)");
	}
}
class Z
{
	public static void main(String[] args)                
	{
		B b1 = new B();
		b1.test(10);
		System.out.println("done");
	}
}
//with same signature we are attempting to override
//super class A concrete method  is inheriting to sub class B  and over riding
//over loading-different signature
//over riding or implementing- same signature