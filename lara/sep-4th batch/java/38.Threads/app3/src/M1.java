class M1 
{







	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();//thread which is executing, that thread reference is returning to t1
		System.out.println(t1);
	}
}
//main thread is a default thread
//

/*Thread[main,5,main]
	first main is name of  thread
	5 is priority of thread
	second main is parent thread main
	*/