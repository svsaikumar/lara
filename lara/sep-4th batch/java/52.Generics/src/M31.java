class A < X >
{
	X obj;
}
class M31
{

	public static void main(String[] args) 
	{
		A < ? super Number> a1 = null;//here a1 is applicable to only super classes to Q
		a1 = new A<Number>();
		a1 = new A<Object>();
		System.out.println("done");
	}
}
