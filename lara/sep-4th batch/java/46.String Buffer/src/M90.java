import java.util.Date;
class M90
{
	public static void main(String[] args) 
	{


		Date d1 = new Date();
		System.out.println(d1);
		long millis = d1.getTime();
		System.out.println(millis);
	}
}
//here we are using no arg constructor of date class
// we will get how many mill secnds from 1970 jan 1 to today