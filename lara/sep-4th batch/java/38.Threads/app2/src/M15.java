interface A
{
	void test(int i,int j);
}
class M15
{
	public static void main(String[] args) 
	{
		
		//A a1 = (int x, int y)
		A a1 = ( x,  y) ->	{
								System.out.println("lambda.test():" + x );
								System.out.println("lambda.test():" + y );
							};

		a1.test(10,20);
		System.out.println("done");
	}
}
//lambda expressiond is for single method interfaces(functional interfaces)
//compiler only developing anonymous inner class.designing an object
//a1 poinitng to subclass to A