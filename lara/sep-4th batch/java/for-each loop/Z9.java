class Z9
{
	public static void main(String[] args) 
	{
		int[] elements = { 10,20,30,40};
		int element;
		for(int element : elements) //JDK 1.5
		{
			System.out.println(element);//inside body element is used directly
		}
	}
} 
//the variable which we required  the for loop should not be declared before for loop or after for loop while using enhcanced for loops
//so we get error here
//element scope should be within for loop
