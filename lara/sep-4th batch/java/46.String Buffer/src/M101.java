import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Locale;
class M101
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -5);
		Date d1 = cal.getTime();
		System.out.println(d1);

		DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALY);
		String s1 = df1.format(d1);
		System.out.println("full:" + s1);

		System.out.println();

		DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		String s2 = df2.format(d1);
		System.out.println("full:" + s2);
	}
}
//format() method is used for coverting a date into String
// 'DateFormat'can be used to format according to a country language