class A 
{
	A(int i, int j)
	{
		System.out.println("A(int, int)");
	}
}


class B extends A
{
	B()
	{
		super(10,20);
		System.out.println("B()");
	}
	B(int i)
	{
		this();
		System.out.println("B(int)");
	}
	B(int i, int j)
	{
		this(i);
		System.out.println("B(int,int)");
	}
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("============");
		B b2 = new B(20);
		System.out.println("============");
		B b3 = new B(20,30);
		System.out.println("============");
	}
}
