class X 
{
	X()
	{
		System.out.println("X()");
	}

	X(int i)
	{
		this();//we can call a constructer from  another constructer(but it should be available)
		System.out.println("X(int)");
	}
	public static void main(String[] args) 
	{
		X x1 = new X();
		System.out.println("=============");
		X x2 = new X(90);
		
	}
}

//'this()' calling statement should be used only inside a constructer.we can't use it inside a method.
//'this()' should be the first statment of the constructer body
//'this()' should be as a calling statement to one of the available constructer
//recursion is not allowed by the compiler through this() calling statement
// need of multiple constructer is different types of intializers
//need of overriding is 
//for one constructer we can create multiple objects of same type
//for executing multiple constructer we use this() calling statement