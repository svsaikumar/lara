import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  M83
{
	public static void main(String[] args) 
	{
	
		//String src = "abc.xyz.test@hello";
		//String src = "abc@hello";
		//String src = "abc.xyz@hello";
		String src = "abc.xyz.test.java.blr@hello";
		String exp = "^[a-z]([a-z]+\\.)*[a-z]+@[a-z]+$";//()represents group
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
