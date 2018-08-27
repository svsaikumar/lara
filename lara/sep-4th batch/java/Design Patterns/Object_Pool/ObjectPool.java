import java.util.Hashtable;
import java.util.Enumeration;
public abstract class ObjectPool < T >//by using generics we can store any type of object in pool
{
	private long expirationTime;
	private Hashtable<T, Long> locked, unlocked;
	public ObjectPool()



	{
		expirationTime = 30000; // 30 seconds
		locked = new Hashtable<T, Long>();
		unlocked = new Hashtable<T, Long>();
	}

	protected abstract T create();

	public abstract boolean validate(T o);

	public abstract void expire(T o);

	public synchronized T checkOut()
	{
		long now = System.currentTimeMillis();
		T t;
		if(unlocked.size() > 0)
		{
			Enumeration<T> e = unlocked.keys();
			while(e.hasMoreElements())
			{
				t = e.nextElement();
				if((now - unlocked.get(t)) > expirationTime)
				{
					//object has expired
					unlocked.remove(t);
					expire(t);
					t = null;
				}
				else
				{
					if(validate(t))
					{
						unlocked.remove(t);
						locked.put(t, now);
						return (t);
					}
					else
					{
						//object failed validation
						unlocked.remove(t);
						expire(t);
						t = null;
					}
				}

			}
		}
		// no object available, create a new one
		t = create();
		locked.put(t,now);
		return(t);
	}
	public synchronized void checkIn(T t)
	{
		locked.remove(t);
		unlocked.put(t, System.currentTimeMillis());
	}
}
//object pool 
//object pool is pool of multiple objects of same type

//locked container=object user for current using cuistoerr(no new customer)
//nobody is usinh , you can use(new customer)
//new customer is going to unlocked and taking an object, copy to locked and used
//checkout = removing from unlocked and kept in locked and using
//checkin = (after using)removing form locked storing into unlocked
//we use hashtable(as a container) as it is synchronoized, so that multiople threads can't enter at a time