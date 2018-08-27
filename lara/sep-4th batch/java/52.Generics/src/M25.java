class A < X >
{
	X obj;
}
class M25
{

	public static void main(String[] args) 
	{
		A < ? extends Number> a1 = null;//we can use a1 this is only for reference varaible
		a1 = new A<Number>();
		a1 = new A<Integer>();
		a1 = new A<Byte>();
		System.out.println("done");
	}
}
//here we can use only subclasses to "Number"