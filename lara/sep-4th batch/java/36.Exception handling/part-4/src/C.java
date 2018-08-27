class C
{
	public static void main(String[] args) 
	{
		test();
	}
	static void test() throws Exception
	{
	}
}
//here "Exception" is checked so we need try-catch  to call test method
//some times "Exception" is checked and some times it is unchecked
//while using "Exception" with throws it is pure checked
/*every exception class or error class we will use  in 3 diffrent ways
				-
				-exception or error with throws
				-exception or erroe with throw