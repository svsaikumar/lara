class class  Z8
{
	public static void main(String[] args) 
	{
		int[] elements = { 10,20,30,40};
		//for-each  (or) enhanced for loop
		for(String element : elements) //JDK 1.5
		{
			System.out.println(element);//inside body, element is used directly
		}
	}
} 
//here data type of array and variable is not same so we get error