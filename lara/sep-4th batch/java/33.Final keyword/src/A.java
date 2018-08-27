class  A
{
	public static void main(String[] args) 
	{
		final int i = 10;//here i is final variable
		int j = 20;
		System.out.println(i);
		System.out.println(j);
		i = 10;//re-intializing the final variable which is illegal
		j = 20;
		System.out.println(i);
		System.out.println(j);
	}
}
//we can't modify the final variable.so we get error here.
//final variables are only for one value purpose.we can't go for multiple values
