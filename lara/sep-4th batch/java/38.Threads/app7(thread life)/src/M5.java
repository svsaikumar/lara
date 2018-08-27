class M5 
{
	public static void main(String[] args) 
	{
		Thread.State[] states = Thread.State.values();
		for(Thread.State state : states)
		{
			System.out.println(state);
		}
	}
}
//diffrernt states of a thread in it's life cycle
/*daemon thread
NEW
RUNNABLE
BLOCKED
WAITING
TIMED_WAITING
TERMINATED
*/
//here we are using enum