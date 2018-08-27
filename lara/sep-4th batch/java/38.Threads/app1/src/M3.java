class A extends Thread
{
	public void run()//we are overriding run method
	{
		for(int i = 1; i <= 10; i++)
		{

			System.out.println(i + Thread.currentThread().getName());
			//System.out.println(i);
			
		}
	}
}
class M3 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();

		for(int i = 20; i <= 30; i++)
		{
			
			System.out.println(i + Thread.currentThread().getName());
			//System.out.println(i);
		}
		System.out.println("done");
	}
}
//multi threading
//thread class is available in java.long which is conretre class containing several methods
//run() method inherited from thread class which  is overrided
//start() method inherited from thread class to class A


//incase of start(), a new thread will be created which is responsible for the exeution of run method
//incase of run(),no new thread will be created, and the run() will be executed just like normal method normally by main thread