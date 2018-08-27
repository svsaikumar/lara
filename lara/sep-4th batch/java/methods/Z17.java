class Z17 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("a:" + test(++i));//11 is sending to test method.receiving 11 from test
		System.out.println("b:" + i);//11
		System.out.println("c:" + test(++i));//12 is sending to test method.receiving 12 from test
		System.out.println("d:" + i);//12
		System.out.println("e:" + test(++i));//13 is sending to test method.receiving 13 from test
		System.out.println("f:" + i);//13
		System.out.println("g:" + test(++i));//14 is sending to test method.receiving 14 from test
		System.out.println("h:" + i);//14
	}
	public static int test(int i)
	{
		return i++;
	}
}
