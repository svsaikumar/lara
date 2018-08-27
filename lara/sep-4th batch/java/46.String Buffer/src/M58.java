import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M58
{
	public static void main(String[] args) 
	{

		String src = "Java made easy to all Java developers";
		String exp = "[abc]";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//if exp is in square[] brackets, then it searches for individual characters