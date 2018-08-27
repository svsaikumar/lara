//lomgest substring without repeating characters
import java.util.LinkedHashMap;
class Q4
{
	public static void main(String[] args) 
	{
		LinkedHashMap map = new LinkedHashMap();
		//String s1 = "abcdhelloabc";
		String s1 = "abcdaxyzbhello";
		String s2 = "";
		int length = 0;
		char c1;
		for(int i =0; i < s1.length(); i++)
		{
			c1 = s1.charAt(i);//a
			if(map.containsKey(c1))
			{
				i = (Integer) map.get(c1);//i = a
				map.clear();
			}
			else
			{
				map.put(c1, i);
				System.out.println(map);
			}
			System.out.println(map.size());
			if(map.size() > length)
			{
				s2 = map.keySet().toString();
				length = map.size();
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}
//any thing can be send as string
//here 'w' is availabe as a key so it is true and 'p' is not available as akey so it prints false