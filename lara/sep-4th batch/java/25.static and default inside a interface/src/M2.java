interface  B
{
	static//SIB is not allowed inside interface 
	{
		System.out.println("B-SIB");
	}
}
class M2
{
	public static void main(String[] args) 
	{
		//B.test();
		System.out.println("done");
	}
}
//SIB's are not allowed inside interface.only static defined methods are allowed.
