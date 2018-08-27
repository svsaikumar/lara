class M7
{
	public static void main(String[] args) 
	{




		String s1 = "true";
		Boolean obj1 = new Boolean(s1);
		Boolean obj2 = Boolean.valueOf(s1);//static value of method

		boolean b1 = obj1.booleanValue();
		boolean b2 = obj2.booleanValue();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("done");
	}
}
//String object content is boxing to boolean and same we are unboxing
//if the content is other than true it prints false
