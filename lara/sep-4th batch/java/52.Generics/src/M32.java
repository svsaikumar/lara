class A < X >
{
	X obj;
}
class M32
{

	public static void main(String[] args) 
	{
		A < ? super Number> a1 = null;//here a1 is applicable to only super classes to Q
		a1 = new A<String>();
		a1 = new A<Integer>();
		System.out.println("done");
	}
}
//String and Integer are not superclasses to Number
