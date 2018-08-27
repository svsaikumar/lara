class P 
{
	public static void main(String[] args) 
	{
		int i = 10;
		final int j = 10;
		class A
		{
			void test()
			{
				System.out.println(i);
				System.out.println(j);
			}
		}
		i = 20;
		System.out.println("done");
	}
}
//local variables referenced from an inner class must be final or effectively final
//here 'i' should be  considered as final in order to use it in local inner class
//inside a local inne classe,if want to use any local variable, then that local varaible should be considered as final