import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;
class M102
{
	public static void main(String[] args) 
	{

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -5);
		Date d1 = cal.getTime();
		System.out.println(d1);

		SimpleDateFormat sf1 = new SimpleDateFormat("dd-MM-yyy");
		String s1 = sf1.format(d1);
		System.out.println(s1);

		System.out.println();

		SimpleDateFormat sf2 = new SimpleDateFormat("dd/MMM/yyyy");
		String s2 = sf2.format(d1);
		System.out.println(s2);

		System.out.println();

		SimpleDateFormat sf3 = new SimpleDateFormat("E-dd/MMMM/yyy");
		String s3 = sf3.format(d1);
		System.out.println(s3);

	}
}
//format() method is used for coverting a date into String
// 'DateFormat'can be used to format according to a country language

/* simpleDateFormat using there formats


  The following pattern letters are defined (all other characters from 'A' to 'Z' and from 'a' to 'z' are reserved):

Letter		Date or Time Component			Presentation				Examples
======		=====================			============				=======
	G			Era designator					Text					AD
	y			Year							Year					1996; 96
	Y			Week year						Year					2009; 09
	M			Month in year					Month					July; Jul; 07
	w			Week in year					Number					27
	W			Week in month					Number					2
	D			Day in year						Number					189
	d			Day in month					Number					10
	F			Day of week in month			Number					2
	E			Day name in week				Text					Tuesday; Tue
	u		Day number of week(1 = Monday, ..., 7 = Sunday)	Number		1
	a			Am/pm marker					Text					PM
	H			Hour in day (0-23)				Number					0
	k			Hour in day (1-24)				Number					24
	K			Hour in am/pm (0-11)			Number					0
	h			Hour in am/pm (1-12)			Number					12
	m			Minute in hour					Number					30
	s			Second in minute				Number					55
	S			Millisecond						Number					978
	z			Time zone						General time zone		Pacific Standard Time; PST; GMT-08:00
	Z			Time zone						RFC 822 time zone		-0800
	X			Time zone						ISO 8601 time zone		-08; -0800; -08:00

	*/

