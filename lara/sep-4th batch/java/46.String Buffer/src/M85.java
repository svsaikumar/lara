import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  M85
{
	public static void main(String[] args) 
	{
		String src = "abc@hello.com";
		String exp = "[a-zA-Z_]+@([a-zA-Z0-9_]+\\.)*[a-zA-Z0-9_]+\\.[a-z]{2,}$";//()represents group
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
//[a-z]{2,}= minimum 2 charactersa nd any max lower alphabet
//[a-z]{2,5} = min 2, max 5 lower alphabet characters
//[a-z]{2,}$ = ending with min 2 characters od lower case alphabet
