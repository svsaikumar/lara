class A 
{
	static < T > void test(T obj1, T obj2, T obj3)//before return we can represent generic
	{								  //it is local to that method
	}									  //we can use it for static also
	
}
class M63
{
	public static void main(String[] args)
	{
		A.<Integer>test(100, 200);//T is qualified as Integer
		A.<String>test("abc", "xyz");//T is qualified as String
		System.out.println("done");
	}
}