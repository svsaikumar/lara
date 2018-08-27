class F 
{
	public static void main(String[] args) 
	{
		final int x[] = new int[3];
		x[2] = 20;
		System.out.println("done");
	}
}
//here we are modifying the value in index-2 but not array -x so we didn't get error here
