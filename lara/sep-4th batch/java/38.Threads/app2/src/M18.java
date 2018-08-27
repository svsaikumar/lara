class  M18
{




	public static void main(String[] args) 
	{
		Runnable r1 = () -> System.out.println("from run");
		Thread t1 = new Thread(r1);
		t1.start();
		System.out.println("done");
	}
}
//lambda expressions
//runnable interface is a functional interface
