class X 
{
	private X()
	{
	}
	//X x1 = new X(); this is allowed
}
 class F 
{
	public static void main(String[] args) 
	{
		X x1 = new X();
		System.out.println("done");
	}
}
//if consructer is private then we can't create object for that class in another class(in same class it is allowed)
//in extended subclass also it is not possible