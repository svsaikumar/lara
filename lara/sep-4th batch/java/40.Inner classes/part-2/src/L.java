class  L
{
	public static void main(String[] args) 
	{



		void test()
		{
			System.out.println("from A");
			System.out.println("from A");
			System.out.println("from A");
		}
		test();
		test();
		test();
		
		System.out.println("done");
	}
}
//we can't define a method inside a method ,constructer, IIB, SIB
//method nesting is not possible in java
// always method  should be the member of class