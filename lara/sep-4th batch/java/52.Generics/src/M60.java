class A < T >
{
	T obj;
}
class M60
{
	public static void main(String[] args)
	{
		A<Integer>a1 = new A();
		a1.obj = 200;
		System.out.println("done");
	}
}
//genereic are introduced in JDK1.5
// in 1.5, 1.6 we have to supply generic type for Object also
//but from 1.7 onwards there is no need to mention generic for Object(right hand side)
