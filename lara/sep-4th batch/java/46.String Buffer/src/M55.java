import java.util.regex.Pattern;
import java.util.regex.Matcher;
class M55 
{
	public static void main(String[] args) 
	{

		String src = "Hello To All";
		String exp = "o";
		Pattern p1 = Pattern.compile(exp);
		Matcher m1 = p1.matcher(src);
		while(m1.find())
		{
			System.out.println(m1.start() + ":" + m1.group());
		}
	}
}
//pattern = 
//matcher =
//regex= regular expression
//by using exp defining a pattern
//finding how many patterns are there inside a source
//pattern is built on top of expression
//how many matchses are there inside 
//"Matcher" object contains all the mathces of an expressin in the source
//start() returns index of match
//group() returns value of index(here it is expression)
//as long as matches are there, while loop is containing