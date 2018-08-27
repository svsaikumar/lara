class A < X extends R>
{
	X obj;
}
class M18 
{
	public static void main(String[] args) 
	{
		A<P> a1 = new A<P>();
		A<Q> a2 = new A<Q>();
		System.out.println("done");
	}
}
// we can't supply P, Q to R
//we have to supply either R or subclass to R type
