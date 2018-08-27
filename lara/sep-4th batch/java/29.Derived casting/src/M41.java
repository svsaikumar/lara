class M41 
{
	public static void main(String[] args) 
	{
		B b1 = new D();


		System.out.println(b1.i);
		System.out.println(b1.j);
		if(b1 instanceof D)
		{
			D d1 = (D) b1;
			System.out.println(d1.k);
			System.out.println(d1.l);
		}
	}
}
//by using b1 we can use only B class varables.but k and l are not the variables of B class.so we get error
