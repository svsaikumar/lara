import java.util.TreeMap;
class A 
{
	int i;
	A(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return "i = " + i;
	}
}

class  M90
{
	public static void main(String[] args) 
	{

		TreeMap map= new TreeMap(

						(obj1, obj2) ->  ((A)obj1).i - ((A)obj2).i);

		System.out.println(map.put( new A(22), "abc"));
		System.out.println(map.put( new A(2), 3.4));
		System.out.println(map.put( new A(24), 'a'));
		System.out.println(map.put( new A(5), 'a'));
		System.out.println(map.put( new A(26), 'a'));
		System.out.println(map.put( new A(10), true));
		System.out.println(map);
		System.out.println("headMap of 23:" + map.headMap(new A(23)));//specified elemetn is exclusive
		System.out.println("headMap of 22:" + map.headMap(new A(22)));//specified elemetn is exclusive
	}
}
//"TreeMap" has a feature of autosorting
//all keys should be of same type, no null as key is alloweod(but null as value is allowed)