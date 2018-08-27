import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  M80
{
	public static void main(String[] args) 
	{
		String src = "abc.xyz.hello";
		String exp = "\\.";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//we can't send only one backwardslash 