class E 
{
	final int i = 10;
	public static void main(String[] args) 
	{
		E e2 = new E();
		e2 = new E();
		System.out.println("done");
	}
}
//here e2 is not final.so we can modify e2 any number of times
//here only i is final
