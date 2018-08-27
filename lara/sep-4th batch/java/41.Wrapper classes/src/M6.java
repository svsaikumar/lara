class M6
{
	public static void main(String[] args) 
	{


		String s1 = "10.5";
		Double obj1 = new Double(s1);
		Double obj2 = Double.valueOf(s1);//static value of method
  
		double d1 = obj1.doubleValue();
		double d2 = obj2.doubleValue();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("done");
	}
}
//in order to convert String object doubleo doubleeger object it should not contain any other character except numbers
//only incase of flaot and double (.) is allowed
//