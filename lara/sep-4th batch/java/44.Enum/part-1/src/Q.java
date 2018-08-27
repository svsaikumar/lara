class Q 
{
	public static void main(String[] args) 
	{
		Month p1 = Month.valueOf("JAN");//p1 refering to JAN
		System.out.println(p1);
		Month p2 = Month.valueOf("FEB");//p2 refering to FEB
		System.out.println(p2);
		Month p3 = Month.valueOf("JULY");//p3 refering to JULY
		System.out.println(p3);
	}
}
//here we get exception because there is no enum constant "JULY"
//valueOf() returns
//compiler didn't verify the content in double quotes.so we didn't error, we get exception