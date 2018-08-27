class A 
{
	private int i = 10;
	public static void main(String[] args) 
	{
		
		
		
		A a1 = new A();
		System.out.println(a1.i);
	}
}


//here 'i' is private.it is accessible within the current class.Outside of this class we can't use it.
//private members are accessible for  the current class only(even it is extends with super class also we can't access it)
//default scope members usage and inheritance should be in the current package only.