class A < X >
{
	X obj;
}
class M26
{

	public static void main(String[] args) 
	{
		A < ? extends Number> a1 = null;//we can use a1 this is only for reference varaible
		a1 = new A<P>();
		a1 = new A<String>();
		a1 = new A<Object>();
		System.out.println("done");
	}
}
//here we can't apply a1 to any other type, except subclasses to Number and to Number
//wild-card extends a particular class