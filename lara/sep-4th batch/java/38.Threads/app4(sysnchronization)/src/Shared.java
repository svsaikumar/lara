class Shared 
{
	
		void test1()
		{
			Thread th = Thread.currentThread();
			for(int i = 1; i < 10; i++)
			{
				System.out.println("test-1:" + th.getName() + ":" + i);
			}
		}
		void test2()
		{
			Thread th = Thread.currentThread();
			for(int i = 1; i < 10; i++)
			{
				System.out.println("test-2:" + th.getName() + ":" + i);
			}
		}
		synchronized void test3()
		{
			Thread th = Thread.currentThread();
			for(int i = 1; i < 10; i++)
			{
				System.out.println("test-3:" + th.getName() + ":" + i);
			}
		}
		synchronized void test4()
		{
			Thread th = Thread.currentThread();
			for(int i = 1; i < 10; i++)
			{
				System.out.println("test-4:" + th.getName() + ":" + i);
			}
		}
		static void test5()
		{
			Thread th = Thread.currentThread();
			for(int i = 1; i < 10; i++)
			{
				System.out.println("test-5:" + th.getName() + ":" + i);
			}
		}
		static void test6()
		{
			Thread th = Thread.currentThread();
			for(int i = 1; i < 10; i++)
			{
				System.out.println("test-6:" + th.getName() + ":" + i);
			}
		}
		synchronized static void test7()
		{
			Thread th = Thread.currentThread();
			for(int i = 1; i < 10; i++)
			{
				System.out.println("test-7:" + th.getName() + ":" + i);
			}
		}
		synchronized static void test8()
		{
			Thread th = Thread.currentThread();
			for(int i = 1; i < 10; i++)
			{
				System.out.println("test-8:" + th.getName() + ":" + i);
			}
		}
	
}
//if multiple threads are executing simultaneously on same object,
//multiple threads calling same or different methods of same object, then there may be a chance of data corruption and decreasing of accuracy
//sharing one object to multiple threads ,as there is  chance of executing more than one thread simultaneously