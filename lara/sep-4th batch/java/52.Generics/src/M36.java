class A < X >
{
	void test(X arg)
	{				
	}				
}
class M36
{
	public static void main(String[] args) 
	{
		A < ? > a1 = null;//a1 is wild card type
		a1 = new A<P>();
		a1.test(new P());
		System.out.println("done");
	}
}
//by using a1 we can't call test method.test() arg is X type
//a1 can be assig to A object of double ,if so, test() method argument is double
//a1 can be assig to A object of integer ,if so, test() method argument is integer
//a1 is allowed to assing any A type object
//test() method arg is X type
//a1 can point to A type of String
//a1 can point to A type of Integer
//a1 can point to A type of person