class Z6 
{
	public static void main(String[] args) 
	{
		Thread.State states[] = Thread.State.values();
		for(int i = 0; i < states.length; i++)
		{
			System.out.println(states[i]);
		}
	}
}
//State is enum name inside thread class
//States of a thread in it's life time is fixed
//output is in upper class because they are constants(fixed)