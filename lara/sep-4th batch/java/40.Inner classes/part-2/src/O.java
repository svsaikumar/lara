class O 
{
	public static void main(String[] args) 
	{




		int i = 10;
		final int j = 10;
		class A
		{
			void test()
			{
				i = 20;
				System.out.println(i);
				System.out.println(j);
			}
		}
		System.out.println("done");
	}
}
//we can modify or use "i" value in entire main method
//here i is acting as final as 'i' is no modified
//here if we consider i as final, then only we can use it
//inside inner class, which can use only local final variables
//as i is acting as final we can't modify it 


//local variables referenced from an inner class must be final or effectively final