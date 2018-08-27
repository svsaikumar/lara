import java.util.regex.Matcher;
import java.util.regex.Pattern;
class M68
{
	public static void main(String[] args) 
	{

		String src = "abc xyz h3ello";
		String exp = "^a";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	
	}
}
//^(tow) character represents the starting of a string
//here it checks whether the String is starting with 'a' or not