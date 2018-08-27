class E 
{
	public static void main(String[] args) 
	{
		double x[] = new double[5];
		String y[] = new String[6];
		
		for(double i : x)
		{
			System.out.println(i);
		}

		for(String i : y)
		{
			System.out.println(i);
		}
		System.out.println("done");
	}
}
//we can use array symbol after indetifier or after data type both are allowed
//we can enhanced for loop to read every element of the array.we should not use array symbol in enhanced loop