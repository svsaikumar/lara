import java.util.Arrays;
import java.util.Collections;
class V 
{
	public static void main(String[] args) 
	{
		String[] x = {"hello", "abc", "Test", "java", "blr", 
						"Babu", "Red", "1234",  "manu", "8979"
					 };
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		Arrays.sort(x, Collections.reverseOrder());
		System.out.println(Arrays.toString(x));
	}
}
//when there is both numericals and literals , the preference is given to numericals first,
//then to Upper case letters then lower case letters
//sort() metod internally uses ASCII code(number, then upper case after lowe case order)