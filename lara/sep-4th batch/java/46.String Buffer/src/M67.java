import java.util.regex.Matcher;
import java.util.regex.Pattern;
class M67
{
	public static void main(String[] args) 
	{

		String src = "aba xyz h3ello";
		String exp = "\\S";//W searches for special characters
							//w searches for otherthan special charactere
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//s = searches for white spaces
//S = other than spaces,