






class A extends Thread
{
	public void run()
	{
		System.out.println("run begin");
		Util.sleep(1000);
		System.out.println("run end");
	}
}
class  M7
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
		Util.sleep(500);
		System.out.println("1:" + a1.getState());

	}
}

