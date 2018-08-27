import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  M77
{
	public static void main(String[] args) 
	{
		String src = "abc4xyz6hello";
		String exp = "[A-z]+";//occurance of  lower case alphabet a-z.+ represents one or more
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//occurance of lowercase alphabet from a to z