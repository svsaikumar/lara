import java.util.regex.Matcher;
import java.util.regex.Pattern;
class M65
{
	public static void main(String[] args) 
	{

		String src = "a1b2c3%4_5R 8Y0$";
		String exp = "\\W";//W searches for special characters
							//w searches for otherthan special charactere
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//w = word characters(alphabet, numbers and underscore)
//W = (not word type character)searches for only special characters(including spaces)