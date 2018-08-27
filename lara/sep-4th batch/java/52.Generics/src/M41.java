class A < T >
{
	T obj;
}
class M41
{

	public static void main(String[] args) 
	{
		A < ? > a1 = null;
		a1 = new A<Integer>();
		a1.obj = 20;
		System.out.println("done");
	}
}
//obj data type is not fixed so we can't assign any value
//a1 can be assigned with any A type