import java.util.regex.Matcher;
import java.util.regex.Pattern;
class M63
{
	public static void main(String[] args) 
	{

		String src = "a1b2c3%4_5R 8Y0$";
		String exp = "\\D";//d  searches for digits
							//D searches for characters otherthan digits.(including spaces)
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
