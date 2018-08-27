import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
class M100
{
	public static void main(String[] args) 
	{

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -5);
		Date d1 = cal.getTime();
		System.out.println(d1);

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		String s1 = df1.format(d1);
		System.out.println("short:" + s1);

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		String s2 = df2.format(d1);
		System.out.println("medium:" + s2);

		DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
		String s3 = df3.format(d1);
		System.out.println("long:" + s3);

		DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
		String s4 = df4.format(d1);
		System.out.println("full:" + s4);
	}
}
//format() method is used for coverting a date into String