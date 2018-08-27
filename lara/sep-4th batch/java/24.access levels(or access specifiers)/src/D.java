class X 
{
	private static int i;
}
class D
{
	public static void main(String[] args) 
	{
		System.out.println(X.i);
	}
}
//here i is private in X.we can't access it from D class.(eventhough D is extended from X class)