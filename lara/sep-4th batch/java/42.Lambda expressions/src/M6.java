interface A//interface with only one method is for lamda expressions
{
	int test();
}
class M6
{

	
	public static void main(String[] args)
	{
		 A a2 = () -> 2000;
		int i = a2.test();
		System.out.println(i);
	}
}
//