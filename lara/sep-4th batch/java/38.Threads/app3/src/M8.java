class M8 
{
	public static void main(String[] args) 
	{
		Runnable r1 = () -> {
								System.out.println("from run");
								Thread t1 = Thread.currentThread();
								System.out.println(t1.getId());
								System.out.println(t1.getName());
								System.out.println(t1.getPriority());
								System.out.println(t1.isDaemon());
							};
		Thread t1 = new Thread(r1);
		t1.setName("first thread");
		t1.start();
		System.out.println("done");
	}
}
