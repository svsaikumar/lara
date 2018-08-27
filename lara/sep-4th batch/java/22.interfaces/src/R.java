interface A
{
	void test1();
}
class B 
{
	public void test1()//concrete method
	{
		System.out.println("from test-1");
	}
}
class R extends B implements A
{
	
	public static void main(String[] args)
	{
		R r1 = new R();
		r1.test1();
		System.out.println("done");
	}
}
//every declared method of interface must be implemented in further subclasses(in either implemented sub class or not implemented sub class)
//from B ,test1 is inheriting to R as R is extends with B
//here test1 of B acts as implementd version of A in R
//here the test1() in B is similer to implementation of abstract method test1() in A interface
