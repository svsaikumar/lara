class M6 
{
	public static void main(String[] args) 
	{


		Thread t1 = Thread.currentThread();
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		t1.setName("initiator");
		t1.setPriority(10);
		System.out.println(t1.getPriority());
		System.out.println(t1.getName());
	}
}
//we can't change any thread 'id'
//we can change name and priority.
//we can't change main thread name also as it is already started.