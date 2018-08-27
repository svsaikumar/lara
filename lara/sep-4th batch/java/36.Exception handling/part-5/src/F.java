import java.util.Scanner;
class F 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age = sc.nextInt();
		if(age <= 0)
		{
			throw new AgeIsNegativeException();
		}
		System.out.println("continue.....");
	}
}
//instead of arithemtic exception we use age is negative exception