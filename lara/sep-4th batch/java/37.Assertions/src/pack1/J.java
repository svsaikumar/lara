package pack1;
class J 
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert true : test();
		System.out.println(2);
	}

	static void test()
	{
		
	}
}
//error because after colon there is something which is returning void(it should not return void)
//here return type is void which is not allowed for assertion