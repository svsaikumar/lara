import java.util.ArrayList;
class  ThreadPoolManager
{
	private ArrayList list = new ArrayList();
	public void init()
	{
		ModelThread mt = null;
		for(int i = 0; i < 10; i++)//initializing the pool
		{							//thraed pool= pool of multiple threads (in one conatainer)
			mt = new ModelThread();
			mt.start();
			list.add(mt);
			System.out.println(mt.getName() + " added into pool");
		}
	}
	public ModelThread checkOut()//returninng one model thread to customer(either it is from list or a new one)
	{
		ModelThread mt = null;
		if(list.size() > 0)
		{
			mt = (ModelThread) list.remove(0);//removing index-0 thread, then replacing index-1 thread to index-0
		}
		else
		{
			mt = new ModelThread();
			mt.start();
		}
		System.out.println(mt.getName() + " is checking out");
		return mt;
	}
	public void checkIn(ModelThread mt)//sending used thread into the  container
	{
	
		if(list.size() < 10)
		{
			list.add(mt);
		}
		else
		{
			mt.stop();
		}
		System.out.println(mt.getName() + " is checking in");
	}
	public void release()
	{
		ModelThread mt = null;
		for(int i = 0; i < list.size();)
		{
			mt = (ModelThread) list.get(0);
			mt.stop();
		}
	}
}
