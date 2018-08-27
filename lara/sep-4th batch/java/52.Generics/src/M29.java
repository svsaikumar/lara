class A < X >
{
	X obj;
}
class M29
{

	public static void main(String[] args) 
	{
		A < ? super Q> a1 = null;//here a1 is applicable to only super classes to Q
		a1 = new A<Q>();
		a1 = new A<P>();
		a1 = new A<Object>();
		System.out.println("done");
	}
}