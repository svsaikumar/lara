class A
{
	int i ;
}


class C extends A
{

}


class B extends C,A
{
	B()
	{

	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println("main end");
	}
}
//INHERITANCE is a process by which objects of one class acquire the properties of objects of another class.