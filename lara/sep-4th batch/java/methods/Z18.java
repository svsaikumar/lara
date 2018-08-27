class Z18
{
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println("a:" + test1(i++));//i becomes 11 but 10 is sending to test1.49 printing
		System.out.println("b:" + i);//11 printing
		System.out.println("c:" + test1(++i));//i becomes 12 and 12 is sending.57 printing
		System.out.println("d:" + i);//12 printing
		System.out.println("e:" + test1(i--));// i becomes 11 but 12 is sending.57 printing
		System.out.println("f:" + i);// 11 printing
		System.out.println("g:" + test1(--i));// i becomes 10 and 10 is sending.49 printing
		System.out.println("h:" + i);//10 printing
	}
	public static int test1(int i)//10//12
	{
		return i++    +  test2(++i);//10 + 39= 49	//12 + 45 = 57
		//10(11)		(12)
		//12(13)		(14)
				
	}

	public static int test2(int i)//12//14
	{
		return i++    +    i++   +   i;//14+13+12 = 39	//16+15+14 =45
		//12(13)		13(14)		(14)
		//14(15)		15(16)		(16)

	}
}
