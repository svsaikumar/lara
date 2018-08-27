class Y 
{
	enum A
	{
		CON1, CON2, CON3(10), CON4("ABC");//for every enum constant there should be a corresponding constructer

		A()
		{
			System.out.println("A()");
		}

		A(int i)
		{
			System.out.println("A(int):" + i);
		}

		A(String s)
		{
			System.out.println("A(String):" + s);
		}
	}
	public static void main(String[] args) 
	{
		A a1 = A.CON4;
		System.out.println("========");
		System.out.println(a1);
	}
}
//we can't use enum without entire enum available in the memory