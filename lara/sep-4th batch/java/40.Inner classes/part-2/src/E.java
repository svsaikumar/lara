class  E
{
	class B
	{
	}

	static class C
	{
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		B b1 = new E().new B();//we didn't get error here as we using outer class reference
		//C c1 = new C();
		System.out.println("done");
	}
}