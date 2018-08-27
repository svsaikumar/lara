abstract class A
{
	A()
	{
		//super(); this is created by default by compiler
		System.out.println("A()");
	}
}

abstract class B extends A  
{
	B()
	{
		//super();this is created by default by compiler
		System.out.println("B()");
	}
}
class C extends B//non- abstarct or concrete method
{
	/*
	C()
	{
		super();this is created by default by compiler
	}
	*/
}
class P
{
	
	public static void main(String[] args) 
	{
		
		C c1 = new C();
		System.out.println("done");
	}
}
//even class(evenabstract)should have a min.constructer.it not compiler will develop a default no arg constructer.
//that constructer will execute when obj is created in concrete subclass of abstact class,
//then it will execute by default super calling statement of it's subclass constructer(may be default also) when an object is created in the subclass
//it is possible to develop any number of constructers,if not compiler will develop a default no arg constructer.
