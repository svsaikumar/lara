class A 
{
	static < T > void test(T obj1, T obj2)//before return we can represent generic
	{								  //it is local to that method
	}									  //we can use it for static also
	
}
class M66
{
	public static void main(String[] args)
	{
		A.<Integer>test(100, 200);
		A.test(200, "xyz");//here T is qualified as Object type
		System.out.println("done");
	}
}
