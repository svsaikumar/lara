class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(1);
		System.out.println("main end");
	}

		public static void test(int i)
		{
				
			System.out.println("test begin:" + i);
			i++;
			if(i == 3)
			{
				return;
			}
			test(i);
			System.out.println("test end:" + i);


		}
	
}
