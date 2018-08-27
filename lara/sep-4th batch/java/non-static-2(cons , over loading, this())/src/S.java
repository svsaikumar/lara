class S
{
	int i ;
	S()
	{
		System.out.println("S()");
	}
	S(int i)
	{
		System.out.println("S(int)");
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println("==========");
		S s2 = new S(20);
		System.out.println("==========");
		S s3 = new S();
		System.out.println("==========");
	}
}
//a class can have any number of constructers,but there should be a change in signature when there are multiple constructers.
//every constructer should have a unique signature.
//Developing multiple constructer in same class with different signature is called as constructer over riding
//while object is creating we have to specify one of the available constructers
//by using one constructer we can create any number of objects
//eventhough class contain multiple constructers, the constructer which is specified while obj creating is only executing.
