class M5
{
	public static void main(String[] args) 
	{
		String s1 = "10";//s1 is a string object which contains a number


		Integer b1 = new Integer(s1);
		Integer b2 = Integer.valueOf(s1);//static value of method
		int i = b1.intValue();
		int j = b2.intValue();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("done");
	}
}
//in order to convert String object into integer object it should not contain any other character except numbers