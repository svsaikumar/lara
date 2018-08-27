class A < X >
{
	X obj;
}
class M35
{

	public static void main(String[] args) 
	{
		A < ? > a1 = null;
		a1 = new A<P>();
		a1.obj = new P();//error here
		System.out.println("done");
	}
}
//