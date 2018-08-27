class P1
{
	public int test() 
	{
		int i = 10;
		return i;
	}
	public void test2() 
	{
		
		System.out.println(test());
	}
	public static void main(String[] args)
	{
		P1 p = new P1();
		p.test2();
	}
}

//we can use static members of one class in another class
//