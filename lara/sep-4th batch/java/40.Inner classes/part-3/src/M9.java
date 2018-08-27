class M9 
{
	public static void main(String[] args) 
	{
		B b1 = new B(90)
		{

			//Here there is default no arg constructer.
			{
				System.out.println("AIC-IIB");
			}

		};
		b1.test1();
		System.out.println("done");
	}
}
//here in default cons, the first statement super() statement has an argument 90 i.e super(90);
//the agruemt for super() is based on the object created