class A < X >
{
	X obj;
}
class M23
{
	public static void main(String[] args) 
	{
		
		A<?> a1 = null;//? is a wild card characer.this wild-card character is allowed only to reference variables
		a1 = new A<Integer>();
		a1 = new A<Object>();
		a1 = new A<P>();
		a1 = new A<String>();
		a1 = new A<Thread>();
		a1 = new A<Float>();
		System.out.println("done");
	}
}
//if any referecne is wild card type(i.e ?), then that varaible can apply to any generic object
//a1 can be assigned to any generic object
//while defining a object to a1, we can choose any data type