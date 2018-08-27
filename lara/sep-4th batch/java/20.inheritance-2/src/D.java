class C 
{
	C()
	{
		//super();
		//calling statement to IIB of C class
		System.out.println("C()");
	}

	{
		System.out.println("C- IIB");
	}
}
class D extends C
{
	D()
	{
		//super();
		//calling statement to IIB of D class
		System.out.println("D()");
	}

	{

		System.out.println("D- IIB");
	}

	public static void main(String[] args) 
	{
		//C c1 = new C();
		System.out.println("============");
		D d1 = new D();
	}
}

//if there is any IIB , then compiler will develop calling statement to IIB inside constructer body after super()
//we can't call IIB explicitly
//all the statements in the cons body will executed after the super() and IIB calling statement
//if first statemetn is this(), then it will not encorporate IIB calling statement