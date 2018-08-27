import java.util.regex.Pattern;//regex regular expression
import java.util.regex.Matcher;
class  M74
{
	public static void main(String[] args) 
	{

		String src = "abc   xyz   hello";
		String exp = "\\s";	    //s stands for  'spaces'
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
