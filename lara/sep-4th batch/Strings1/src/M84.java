import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  M84
{
	public static void main(String[] args) 
	{
	
		String src = "a1.B.C1.d5@hello";
		String exp = "^[a-z]([a-zA-Z0-9]+\\.)*[a-zA-Z0-9]+@[a-z]+$";//()represents group
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
