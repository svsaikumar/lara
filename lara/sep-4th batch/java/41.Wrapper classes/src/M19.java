class M19 
{
	public static void main(String[] args) 
	{
		
		
		
		Short obj1 = new Short((short)20);

		Integer obj2 =new Integer(20);

		obj2 = obj1;//error here
		System.out.println("done");
	}
}
//here we get compile time as error because we can't convert wrapper Short into wrapper Integer
//by default 20 acts as primitive int type here