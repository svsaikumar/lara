import java.util.regex.Pattern;//regex regular expression
import java.util.regex.Matcher;
class  M73
{
	public static void main(String[] args) 
	{
		String src = "a123b456c789";
		String exp = "\\d+";//+ stands for one or more
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//d searches for one digit occurance
//d+ searces for one or more digits combination occurance
