import java.text.NumberFormat;
class M105 
{
	public static void main(String[] args) 
	{


		double num = 2345463.56786;
		System.out.println(num);
		NumberFormat nf = NumberFormat.getInstance();
		String s1 = nf.format(num);
		System.out.println(s1);
	}
}
//we can format number into a string  in default format
//formating double into String according to default format