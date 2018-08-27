class A < T >
{
	T obj;
}
class M58
{
	public static void main(String[] args)
	{
		A<Integer>a1 = new A<Integer>();
		a1.obj = 100;
		System.out.println("Hello world!");
	}
	
}
//interface attributes are static by default
//so we can't use generic for interface