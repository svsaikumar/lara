import java.util.Arrays;
import java.util.Collections;
class T 
{
	public static void main(String[] args) 
	{
		Integer[] x = {10,4,20,6,30,8,25,15};//using 'Integer' but not 'int'

		Character[] y = { 's', 'a', 'i'};//using "Character" but not "char"
		String[] z = { "sai", "kumar", "yadav"};

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(z));

		Arrays.sort(x, Collections.reverseOrder());
		Arrays.sort(y, Collections.reverseOrder());
		Arrays.sort(z, Collections.reverseOrder());

		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(Arrays.toString(z));
	}
}
//auto boxing(primitive to derived)
//for sorting in descending order we have to use wrapper classes(here it is interger wrapper class)
//elements should be object
//while using wrapper class all the elements ra boxing to integer objects
//Collections class and array claas both are utility classes( using in the collecion API)