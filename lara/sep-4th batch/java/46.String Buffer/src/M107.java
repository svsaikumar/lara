import java.text.NumberFormat;
import java.util.Locale;
class M107
{
	public static void main(String[] args) 
	{
		double num = 2345463.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.UK);
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}
//here we will get currency symbol for particular country also