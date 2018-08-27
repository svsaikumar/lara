class M14
{
	public static void main(String[] args) 
	{



		Integer obj = new Integer(90);

		int i = obj;//obj is reference variable(derived type) to one class, 'i' is primitive//int i = obj.intValue();compiler replaces it(auto unboxing)
				//assigning  a reference to primitive
		System.out.println(i);
		System.out.println("done");
	}
}
//heterogenoous
//upto JDK 1.4 we can't assign a reference to primitive
//here obj is derived type