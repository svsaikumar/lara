class E
{
	int i;
	void test1()

	
	{
		System.out.println("from test-1:" + this.i);
		this.i = 10;
		this.test2();
	}
	void test2()
	{
		System.out.println("from test-2:" + this.i);
		this.i = 20;//here also "this" is e1 as test 2 is called by test1 which is called by e1
	}
	
	public static void main(String[] args) 
	{
		
		E e1 = new E();
		e1.i = 30;
		System.out.println("from main-1:" + e1.i);
		e1.test1();
		System.out.println("from main-2:" + e1.i);
		e1.i = 40;
		e1.test2();
		System.out.println("from main-3:" + e1.i);

	}
}
//in every non static definition block there is a defaut reference variable .that default reference variable is 'this'
//'this' is not available inside main, sib, iib block.so we created a reference variable 'e1' in main method
//'this' is only available in non-static definition blocks
//object can be created in any method
