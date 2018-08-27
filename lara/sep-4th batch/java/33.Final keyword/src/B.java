class  B
{
	
	public static void main(String[] args) 
	{
		final int i;
		i = 10;
		int j = 20;
		System.out.println(i);
		System.out.println(j);
		i = 10;
		j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}
//final variable can be decalered without initialization.we can initialize afterwards but only one time
//in the case of final global,we have to initialize at the time of declaration only