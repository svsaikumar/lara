class X 
{
	enum A
	{
		CON(100), TEST(200);

		
		A(int i)
		{
			System.out.println("A(int):" + i);
		}
	}
	public static void main(String[] args) 
	{
		A a1 = A.TEST;
		System.out.println(a1);
	}
}
//every enum constant should have a corresponding constructer
//inside enum also , one constructer is mandatory,if not compiler is developing a no arg constructer by default