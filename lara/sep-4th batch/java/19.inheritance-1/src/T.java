class S 
{
	S(int i)
	{
		System.out.println("S(int)");
	}
}
class T extends S
{
	T(int i)
	{
		super(i);
		System.out.println("T(int)");
	}
	public static void main(String[] args) 
	{
		T t1 = new T(90);
		System.out.println("done");
	}
}
//super calling statement should  not be inside a method, IIB, SIB.it should be only in constructer
//super() always should be the first statement in the constructer body
//super() should be as a calling statement to one of the available constructers in the super class