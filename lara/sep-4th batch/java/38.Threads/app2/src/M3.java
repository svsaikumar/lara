class M3 
{
	public static void main(String[] args) 
	{


		Runnable r1 = new Runnable()
		{
			public void run()//subclass to runnable interface.inside subclass run method is implementing
			{				//subclss is concrete as run is implemented
							//for subclass creating an object
				for(int i = 1; i < 10; i++)
				{
					System.out.println("run:" + i);
				}
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();//r1.run//r1 pointing to subclass to run(same run will be executed)
		for(int i = 1; i < 10; i++)
		{
			System.out.println("main:" + i);
		}

	}
}
//only one method is to be implemented then it is recomended to use anonymous innerclass
//thread obj has r1 (has a relation)
