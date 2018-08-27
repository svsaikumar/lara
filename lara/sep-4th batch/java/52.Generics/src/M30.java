class A < X >
{
	X obj;
}
class M30
{

	public static void main(String[] args) 
	{
		A < ? super Q> a1 = null;//here a1 is applicable to only super classes to Q
		a1 = new A<R>();
		a1 = new A<S>();
		a1 = new A<String>();
		a1 = new A<Number>();
		System.out.println("done");
	}
}
//here R, S, String , Number are not super classes to Q.so we get error