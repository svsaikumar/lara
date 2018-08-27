import java.util.regex.Pattern;
import java.util.regex.Matcher;
class  M81
{
	public static void main(String[] args) 
	{
		String src = "abc@hello";
		String exp = "[a-z]+@[a-z]+";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		System.out.println(m1.find());
	}
}
//it represents before @ one alphabet and after @ alphabet
//+ represents one or more
//[] represents one character
//1.^A
//2.[A-z]+(an) + [A-z]