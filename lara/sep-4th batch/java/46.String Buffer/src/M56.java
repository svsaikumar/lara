import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M56 
{
	public static void main(String[] args) 
	{

		String src = "Hello To All";
		String exp = "l";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}