//package pack1;







class M9
{
	public static void main(String[] args)
	{
		Day d1=Day.valueOf("SAT");
		System.out.println(d1);
		Day d2=Day.valueOf("mon");
		System.out.println(d2);
	}
}


// value of is another method we have to spacify 

/* output : SAT
Exception in thread "main" java.lang.IllegalArgumentException: No enum constant pack1.Day.mon
        at java.lang.Enum.valueOf(Unknown Source)
        at pack1.Day.valueOf(Day.java:2)
        at pack1.M9.main(M9.java:8)

*/