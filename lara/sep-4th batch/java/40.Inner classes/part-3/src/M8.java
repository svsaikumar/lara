class M8 
{
	public static void main(String[] args) 
	{
		B b1 = new B()
		{

			//Here there is default no arg constructer
			{
				System.out.println("AIC-IIB");
			}

		};
		b1.test1();
		System.out.println("done");
	}
}
//compiler develops a cons inside anonymous inner class.in that first statement is super();
//we can't develop a cons inside anonymous inner class.But can go for IIB.