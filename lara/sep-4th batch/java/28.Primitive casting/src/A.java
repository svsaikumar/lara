class  A
{
	public static void main(String[] args) 
	{



		byte b1 = 100;
		short s1 = b1;//short s1 = (short) b1;compiler will generate this line automatically
		int i = s1;
		double d1 = i;//double d1 = (double)i;compiler will generate this line automatically
		double d2 = s1;
		double d3 = b1;
		System.out.println("done");
	}
}
//here there is no need to convert narrower to wider explicitly,compiler will automatically convert it
//always assignment will be from right to left