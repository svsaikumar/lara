interface A
{
	int test(int i, int j);
}
class M7
{

	
	public static void main(String[] args)
	{
		 A a1 = (x,y) -> x + y;
		int i = a1.test(10, 20);
		System.out.println("done with:" + i);
	}
}
//in case of lamda if there is only one statement then there is no need of return statement
//here there are more than one statement it is required to specify return statement