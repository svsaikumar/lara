class  H
{
	class B
	{
	}

	static class C
	{
	}
	public static void main(String[] args) 
	{
		H.B b1 = new H().new B();
		H.C c1 = new H.C();
		System.out.println("done");
	}
}
//if we want to go for data type purpose while using inner class, specify outer.inner, nomatter of type of inner class(static or non static)
