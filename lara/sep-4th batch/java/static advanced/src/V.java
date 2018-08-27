class V 
{
	static
	{
		System.out.println("V-SIB");

	}
	public static void main(String[] args) 
	{
		System.out.println("V- main begin");
		System.out.println(U.i);
		System.out.println("===============");
		System.out.println(U.i);
		System.out.println("V- main end");
	}
}
//we are using U in V
//if we want to use one java file  in another java file the condition shoulld be followed is 
//the first file should be saved with the classs to name