import java.util.Date;
import java.util.Calendar;
class M93
{
	public static void main(String[] args) 
	{

		Calendar cal = Calendar.getInstance();
		//System.out.println(cal);
		Date d1 = cal.getTime();
		System.out.println(d1);
	}
}
//calsendar is a abstrct class so we can't create object to that class
//so we for getInstance()
//inside 