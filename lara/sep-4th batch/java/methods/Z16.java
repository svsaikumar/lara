class Z16 
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("a:" + test(i++));//i becoming 11 but 10 only sending to test method
		System.out.println("b:" + i);//11
		System.out.println("c:" + test(i++));//i becoming 12 but 11 only sending to test method
		System.out.println("d:" + i);//12
		System.out.println("e:" + test(i++));////i becoming 13 but 12 only sending to test method
		System.out.println("f:" + i);
	}
	public static int test(int i)
	{
		return i++;
	}
}
