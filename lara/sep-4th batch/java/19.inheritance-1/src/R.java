class Q 
{
	Q(int i)
	{
		System.out.println("Q(int)");
	}
}
class R extends Q
{
	R(int i)
	{
		//super();compiler will develop super() by default
		System.out.println("R(int)");
	}
	public static void main(String[] args) 
	{
		R r1 = new R(90);
		System.out.println("done");
	}
}
//in Q class there is no "no arg" constructer.so we get error