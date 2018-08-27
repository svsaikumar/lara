class A < X >
{
	X obj;
	void test(X arg)
	{
	}
}
class M37
{

	public static void main(String[] args) 
	{
		A < ? extends Number> a1 = null;//a1 can assing to A type of Number
										//a1 can assing to A type of subclass to Number
		a1 = new A<Integer>();
		a1.obj = new Integer(10);
		//a1.test(new Integer(10));
		System.out.println("done");
	}
}
//we can develop any number of subclasses for a class Number
//eventhough a1 pointing to A type Numeber class,it can have any number of subclasses
//Number can have any subclasses as Number is not final classs
//we can't call test by using a1, as it is wild card
//infinite options can assing to A type Number