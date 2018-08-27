import java.util.Date;
class M92
{
	public static void main(String[] args) 
	{


		Date d1 = new Date();
		Date d2 = new Date(d1.getTime() + 1000 * 60 * 60 *24);
		Date d3 = new Date(d1.getTime() - 1000 * 60 * 60 *24);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
	}
}