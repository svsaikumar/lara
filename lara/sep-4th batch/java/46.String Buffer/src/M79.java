import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  M79
{
	public static void main(String[] args) 
	{
		String src = "5abc4xyz6hello";
		String exp = "^[a-z]*";//* represents 0 or more
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
