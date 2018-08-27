class A 
{
	static < T , S> S test(T obj1, S obj2)//before return we can represent generic
	{		
		return obj2;					//it is local to that method
	}									//we can use it for static also
	
}
class M67
{
	public static void main(String[] args)
	{
		String s1 = A.<Integer, String>test(100, "abc");
		System.out.println("done with:" + s1);
	}
}
