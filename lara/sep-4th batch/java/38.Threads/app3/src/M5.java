class M5 
{



	public static void main(String[] args) 
	{
		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		System.out.println(t1.isDaemon());//Daemon status is false
	}
}
//main thread reference getting into t1
//every thread id is unique(it is "long" number[data type])
//we can't modify id of the thread
//throughout the life of thread,ID is same
//to identify any thread, to refer a thread from a group of threads use "id"
//the default name of main thread is 'main'
//child threads name will be "Thread-0,1,2,3......"
//to read the name of the thread use "getName()"
/*there are 2 ways to change default name of thread
				-through setName() method
				-through a constructer

*/               
//priority is a integer between 1 to 10
//1 stands for min.priority
//10 is max. priority
//5 is normal priority
//to read the priority we use "getPriority()"
//we can modify the default priority through "setPrioroty()"
//default priority of main thread is "5"
//default priority of any child thread is it's parent priority

//there are 2 types of threads
//				-Daemon thread, 
//				user thread
//daemon thread always depends on  it's parent thread life is daemon thread
//user thread doesn't depend on it's parent thread life
//user thread continuously executing irrespective of it's parent
//if isDaemon returns true then it is daemon thread
//if it returns false then that thread is user thread
//main thread is user thread
//by default every child thread is also user thread only
//there is a way of converting user thread into daemon thread by using setDaemon() method but it should be done before start of thread
//once thread started we can't convert
//main thread can't be converted into daemon because main thread is already started