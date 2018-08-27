class N 
{
	public static void main(String[] args) 
	{
		Month all[] = Month.values();//storing all the constants of Month enum in 'all[]' array


		for(int i = 0; i < all.length; i++)
		{
			System.out.println(all[i]);
		}
	}
}
//every enum constant has a unique index starting with '0'
//all enums are inheriting from built in "Enum" super class
//values() is built-in method in 'Enum' class inheriting Month enum