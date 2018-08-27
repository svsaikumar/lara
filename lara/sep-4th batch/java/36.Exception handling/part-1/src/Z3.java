import java.util.Scanner;
class Z3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some thing");
		String s1 = "9";//sc.next();//"12cv"
		try
		{
			System.out.println(1);
			int i = Integer.parseInt(s1);
			System.out.println(2);
			int k = i/(i-9);
			System.out.println(3);

		}
		catch (ArithmeticException ex) //throwable
		{	
			System.out.println(4);
		}
		System.out.println("main end:");
	}
}
//if we enter characters then we will get exception as they are not converted into int
//we have to enter numbers in int range
//here there is not catch to handle numbr format exception
