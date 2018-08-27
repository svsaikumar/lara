class A < X >
{
	X obj;
}
class M33
{

	public static void main(String[] args) 
	{
		A < Integer> a1 = null;//a1 should be assigned only to A type integer
		a1 = new A<Integer>();
		a1.obj = 30;
		System.out.println("done");
	}
}
//there is no wild card here
//here a1.obj is Integer.we can assing only Integer type  values
