class A < X >
{
	X obj;
}
class M39
{

	public static void main(String[] args) 
	{
		A < ? super R> a1 = null;
		a1 = new A<R>();
		a1.obj = new R();
		System.out.println("done");
	}
}
//a1 can be applied to S and super class S
//super class is countable but subclass is not countable
//we can't develop a super class to existing class
//we can develop any number of subclasses to existing class