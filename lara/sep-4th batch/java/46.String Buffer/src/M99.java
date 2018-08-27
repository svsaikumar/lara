import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
class M99
{
	public static void main(String[] args) 
	{

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -5);
		Date d1 = cal.getTime();
		System.out.println(d1);

		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
		String s1 = df.format(d1);
		System.out.println(s1);
	}
}
//format() formatting date content into Stirng(here we can specify the style of the format)
//here we are getting only date but not time in SHORt style