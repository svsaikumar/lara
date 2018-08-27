class B
{
	public static void main(String[] args) 
	{



		byte b1 = 100;
		short s1 = (short)b1;
		int i = (int)s1;
		double d1 = (double) i;
		double d2 = (double) s1;
		double d3 = (double)b1;
		System.out.println("done");
	}
}
//here explicit converting is not necessary.it is optional