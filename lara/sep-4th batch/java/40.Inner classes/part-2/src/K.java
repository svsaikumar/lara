class  K
{
	public static void main(String[] args) 
	{



		class A
		{

			void test()
			{
				System.out.println("from A");
			}
		}
		A a1 = new A();
		a1.test();
		System.out.println("done");
	}
}
//there are 2 types of local inner classes
//we can define a class inside a any method(local inner class)
//as A is local to main method we can't call it from outside the main method(it is not available outside of main method)