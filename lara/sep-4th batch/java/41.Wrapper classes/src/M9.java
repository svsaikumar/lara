class M9
{
	public static void main(String[] args) 
	{




		int i = 10;

		double j = 1.5;
		String s1 = Integer.toString(i);//converting primitive type to String directly
		String s2 = Double.toString(j);//converting primitive type to String directly
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("done");
	}
}
//here toString method is static and is available in wrapper class
//it is not object class toString() method
//any primitive can be converted into string by using toString()