class M31 
{
	public static void main(String[] args) 
	{
		A a1 = new B();



		if(a1 instanceof B)

		{
			B b1 = (B) a1;
			System.out.println("casting is proper");
		}
		System.out.println("done");
	}
}
//a1 pointing to B object