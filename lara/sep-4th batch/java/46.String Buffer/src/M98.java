import java.util.Date;
import java.util.Calendar;
import java.text.DateFormat;
class M98
{
	public static void main(String[] args) 
	{

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -5);//here we are getting 5 years back date to  todays date
		Date d1 = cal.getTime();
		System.out.println(d1);

		DateFormat df = DateFormat.getInstance();
		String s1 = df.format(d1);
		System.out.println(s1);
	}
} 
//format() formatting date content into Stirng