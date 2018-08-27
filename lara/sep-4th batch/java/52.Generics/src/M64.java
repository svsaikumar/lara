class A 
{
	static < T > void test(T obj1, T obj2)//before return we can represent generic
	{								  //it is local to that method
	}									  //we can use it for static also
	
}
class M64
{
	public static void main(String[] args)
	{
		A.test(100, 200);
		A.test("abc", "xyz");
		System.out.println("done");
	}
}
//T is qualifying as Object type as we not mentioning any type