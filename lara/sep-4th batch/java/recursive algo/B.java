class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(2);
		System.out.println("==========");
		System.out.println("main end");
	}

		public static void test(int i)
		{
				
			/*
				for(int i = 1; i<3;i++)
				System.out.println("from test");
			}*/
			System.out.println("from test");
			System.out.println("=========");
			if(i == 0)
			{
				return;
			}
			i--;
			test(i);
		}
	
}
//stack memory and heap memory
//stack memory is only for execution
//heap memory is only for storage purpose
