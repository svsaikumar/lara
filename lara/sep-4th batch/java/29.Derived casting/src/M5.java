class M5 
{
	public static void main(String[] args) 
	{
		A a1 = new D();


		Object obj = new B();

		C c1 = new D();
		B b1 = new E();//B b1 = (E) new E(); compiler will develop this 
		D d1 = new E();
		A a2 = new B();
		A a3 = new C();//A a3 = (A) new C();compiler will develop this 
		System.out.println("done");
	}
}
//here compiler only do auto upconversion