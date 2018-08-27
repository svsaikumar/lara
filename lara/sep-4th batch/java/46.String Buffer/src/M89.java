import java.util.Date;
class M89
{
	public static void main(String[] args) 
	{


		Date d1 = new Date(1000 * 60 * 60 * 24);
		System.out.println(d1);
		long millis = d1.getTime();
		System.out.println(millis);//here we will total number of milli seconds
	}
}
//getTime() method returns time value in milliseconds