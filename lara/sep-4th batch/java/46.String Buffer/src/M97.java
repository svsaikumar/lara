import java.util.Date;
import java.util.Calendar;
class M97
{
	public static void main(String[] args) 
	{

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -5);//here we are getting 5 years back date to  todays date
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}