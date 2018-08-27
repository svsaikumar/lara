package pack1;
class I
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		assert true:test();
		System.out.println(2);
	}
	static int test()
	{
		return 10;
	}

}
/*
1
2
*/