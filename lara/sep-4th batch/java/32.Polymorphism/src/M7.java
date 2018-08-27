class A 
{
	static 
	{
		System.out.println("from A.SIB");
	}


	public static void test()
	{
		System.out.println("from A.test()");
	}
}
class B extends A
{
	static 
	{
		System.out.println("from B.SIB");
	}
	
}
class M7
{
	public static void main(String[] args) 
	{
		B.test();//A.test();			
	}
}
//here there is no suitable method for which we called so the compiler automatically replaces with the superclass name
//and search for that method