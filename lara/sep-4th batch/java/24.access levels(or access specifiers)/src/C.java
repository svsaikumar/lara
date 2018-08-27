class C 
{
	private C()
	{
		System.out.println("C()");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("done");
	}
}
//we can't access private member from other classes at any cost
//constructer can be private
//constructers cannot be final
//constructers cannot be overridden(cons is treated as static)