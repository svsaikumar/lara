class M10 
{
	public static void main(String[] args) 
	{
		B b1 = new E();


		C c1 = b1;

		D d1 = b1;
		E e1 = d1;
		E e2 = c1;
		E e3 = b1;
		System.out.println("done");
	}
}
//here it requires explicit downcasting which is not done .so we get error here
