class Z2 
{
	static int i = test1();
	static int j = test2();
	static int k = test3();
	static int test3()
	{
		System.out.println("test-3:" + i + "," + j + "," + k);
		return i+j+k+10 ;
	}
	static int test2()
	{
		System.out.println("test-2:" + i + "," + j + "," + k);
		return i+j+k+10 ;
	}
	static int test1()
	{
		System.out.println("test-1:" + i + "," + j + "," + k);
		return i+j+k+10 ;

	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + i +"," + j + "," + k);
		
	}
}
//before intitializing i,j,k they are loaded into the memory with defalut values