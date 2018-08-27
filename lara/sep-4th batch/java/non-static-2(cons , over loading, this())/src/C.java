class C 
{
	void test()
	{
		System.out.println("from test:" + this);//here "this" is c1
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("from main:" + c1);
		c1.test();
	}
}
//may be this is referring wherever it is called by.
//this is available only in non static members but not in static members
//'this' can't be used in static members
//the test method is called c1.so 'this' represents c1(reference variable to call test method)