class H 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");


		int[] x = new int[99999999];//out of memory error




		System.out.println("main end");
	}
}
//all objects are created in heap memory
//heap memory is not sufficient to create the required array

