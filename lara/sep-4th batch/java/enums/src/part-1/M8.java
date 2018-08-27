//package pack1;
class M8
{
	public static void main(String[] args)
	{



		Thread.State[] states = Thread.State.values();
			for (Thread.State state : states)
			{
				System.out.println(state +";"+ state.ordinal());
			}
	}
}
// inside a thread class contain states
// this are order states in the thread cycle
// output : NEW;0
//			RUNNABLE;1
//			BLOCKED;2
//			WAITING;3
//			TIMED_WAITING;4
//			TERMINATED;5
