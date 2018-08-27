import java.text.NumberFormat;
import java.util.Locale;
class M106
{
	public static void main(String[] args) 
	{

		double num = 2345463.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}

//formatting a number to a italy country
//where we are using (,) there we are using (.)