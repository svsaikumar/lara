import java.util.Arrays;
import java.util.Collections;
class U 
{
	public static void main(String[] args) 
	{
		String[] x = {"hello", "abc", "test", "java", "blr"};
		//Character[] x = {'g', 'f', 'e', 'd', 'r'};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		Arrays.sort(x, Collections.reverseOrder());
		System.out.println(Arrays.toString(x));
	}
}
//for sorting String elements in the array