class M2 
{
	public static void main(String[] args) 
	{



		Double obj1 = new Double(5.5);
		Double obj2 = Double.valueOf(5.5);//static method valueOf()

		double d1 = obj1.doubleValue();
		double d2 = obj2.doubleValue();
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("done");
	}
}
//in order to perform any operation on a data type use that corresponding wrapper class
//obj1, obj2 are wrapper classes
//