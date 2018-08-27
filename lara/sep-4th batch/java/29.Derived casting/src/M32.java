class M32 
{
	public static void main(String[] args) 
	{
		A a1 = new A();


		if(a1 instanceof B)
		{
			B b1 = (B) a1;
			System.out.println("casting is proper");
		}
		else
		{
			System.out.println("casting is not proper");
		}
		System.out.println("done");
	}
}
//here instanceof is returning  false so if block is not executing