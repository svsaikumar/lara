class V 
{
	int i ;
	static void test(V obj)//obj is local to test method
	{
		System.out.println("from test:" + obj.i);

		obj.i = 20;
	}
	public static void main(String[] args) //v1 is local to main method
	{
		System.out.println("main begin");
		V v1 = new V();
		v1.i = 10;
		test(v1);
		System.out.println("main end:" + v1.i);
	}
}
//v1 is a reference variable of V data type
//main method 'v1' and test method 'obj', both are referring to same object