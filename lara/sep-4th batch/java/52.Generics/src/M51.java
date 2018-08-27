class A < T >
{
	void method(T obj)
	{
	}
}
class M51
{
	public static void main(String[] args)
	{
		A < ? super Number> a1 = null;
		a1 = new A< Number>();
		a1 = new A< Object>();
		//a1 = new A< Integer>();//error here
		//a1 = new A< String>();//error here
		System.out.println("done");
	}
}