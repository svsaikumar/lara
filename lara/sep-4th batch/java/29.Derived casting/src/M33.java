class M33 
{
	public static void main(String[] args) 
	{
		A a1 = new C();


		if(a1 instanceof B)
		{
			B b1 = (B) a1;
			System.out.println("converted to B type");
		}
		else
		{
			System.out.println("casting to B is not possible");
		}
		if(a1 instanceof C)
		{
			C c1 = (C) a1;
			System.out.println("converted to C type");
		}
		else
		{
			System.out.println("casting to C is not possible");
		}
		if(a1 instanceof D)
		{
			D d1 = (D) a1;
			System.out.println("converted to D type");
		}
		else
		{
			System.out.println("casting to D is not possible");
		}

		System.out.println("done");
	}
}
//here instanceof is returning  false so 3rd-if block is not executing