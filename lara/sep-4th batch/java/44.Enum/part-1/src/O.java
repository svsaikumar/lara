class  O
{
	public static void main(String[] args) 
	{
		Month t1 = Month.JAN;
		Month t2 = Month.DEC;

		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.ordinal());
		System.out.println(t2.ordinal());
		int i = Month.FEB.ordinal();
		System.out.println(i);
	}
}
//ordinal() method is built in method which returns the index of the enum constant
