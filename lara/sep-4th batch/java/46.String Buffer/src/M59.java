import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M59
{
	public static void main(String[] args) 
	{

		String src = "Java made easy to all Java developers";
		String exp = "[a-p]";//here it's a range from 'a' to 'p'
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//here it searches for characters from 'a' to 'p'