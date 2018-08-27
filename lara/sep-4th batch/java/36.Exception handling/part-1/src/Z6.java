import java.util.Scanner;
class Z6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter some thing");
		String s1 = "21"; //sc.next();
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
		finally
		{	
			System.out.println(5);
			
		}
		System.out.println("main end:");
	}
}

//finally will execute for every execution no matter exeception rised or not
//no matter if exception is rised  which type of exception rised(it ignores)
//no matter whether rised exception is handled or not