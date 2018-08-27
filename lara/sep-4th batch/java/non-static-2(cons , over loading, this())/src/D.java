class D 
{
	int i ;
	void test()
	{
		System.out.println("from test  :" + this.i);//here 'this' is d1
		this.i = 20;//here the value of i modifying
	}
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.i = 10;
		System.out.println("from main-1:" + d1.i);
		d1.test();
		System.out.println("from main-2:" + d1.i);
	}
}
//we can use 'this' in place of d1() .'this' is a default reference variable which is available in every non static methods