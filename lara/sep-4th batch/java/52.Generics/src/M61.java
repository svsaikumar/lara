class A < T >
{
	T obj;
}
class M61
{
	public static void main(String[] args)
	{
		A<Integer>a1 = new A();
		A a2 = new A();//we didn't specify any genesric.a2 is object type.so  'a2.obj' can be anything
		a1 = a2;//assigning non-generic to generic(we will get warnings)
		a2 = a1;
		a1.obj = 100;
		a2.obj = 200;
		System.out.println("done");
	}
}
//incase of a1, obj is qualified as Integer type
//incase of a2, obj is  Object type only
//a2 doesn't have any generic
//generics and non-generics can be used in single program