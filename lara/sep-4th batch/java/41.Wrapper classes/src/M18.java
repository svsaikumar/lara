class  M18
{
	static void test(double j)
	{
		System.out.println("test(double)");
	}

	public static void main(String[] args) 
	{
		test(10);
		System.out.println("done");
		int i = 200;
		test(i);
	}
}
//auto-widening
//sub class type can be assigned to super class type-auto upcasting
//every numeric wrapper classes is subclass to number class which is subclass to object class
//every numeric wrapper class is upcasted to number class which can be auto convserted to object class
//byte wrapper class can't cant be converted to short, short into integer, integer into long , long into flaot, float into double

//int primitive can be auto converted into double primitive