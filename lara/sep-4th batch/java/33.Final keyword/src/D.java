class D 
{
	int i;
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.i = 10;

		final D d2 = new D();
		d2.i = 10;

		d1.i = 10;
		d2.i = 10;//here we are modifying i value but not d2(which is final) so we didn't error here

		System.out.println("done");
	}
}
//we can modify i any number of times as it is not final here
