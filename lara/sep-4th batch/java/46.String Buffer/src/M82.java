import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M82
{
	public static void main(String[] args) 
	{

		String src = "abc@hello";
		String exp = "^[a-z]+@[a-z]+$";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
//this represents before @ and starting of String must be from a -z
//and after @ also must be a-z with ending as a-z
//from starting to before @ minimum one alphabet,after @ to end, minimum one alphabet