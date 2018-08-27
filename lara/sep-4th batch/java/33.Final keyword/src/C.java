class C 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1 = new C();

		final C c2 = new C();
		c2 = new C();//error here
		System.out.println("done");
	}
}
//here we get error because c2 is modifying after initializing which is final
