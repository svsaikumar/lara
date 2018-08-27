import java.util.HashSet;
class A
{
	int i, j, k;
	A(int i, int j ,int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public String toString()
	{
		return "(" + i + "," + j + "," + k +")";
	}
	public int hashCode()//overriding
	{
		int hash =  Integer.toString(i).hashCode();
			hash+=  Integer.toString(j).hashCode();
			hash+=  Integer.toString(k).hashCode();

			System.out.println("hashCode for " + this + ":" + hash);

		return hash;
	}
	public boolean equals(Object obj)//overriding
	{
		boolean flag = (obj instanceof A) && 
						(i == ((A)obj).i) &&
						(j == ((A)obj).j) &&
						(k == ((A)obj).k);

		System.out.println("equals b/w " + this + ":" + "and" + obj + ":" + flag);
		return flag;
	}
}
class M41
{
	public static void main(String[] args) 
	{
		HashSet set= new HashSet();
		System.out.println(set.add(new A(90, 120,40)));
		System.out.println("============================================");

		System.out.println(set.add(new A(90, 120, 40)));
		System.out.println("============================================");

		System.out.println(set.add(new A(90, 40,120)));
		System.out.println("============================================");

		System.out.println(set.add(new A(90, 40, 120)));
		System.out.println("============================================");

		System.out.println(set.add(new A(120, 40, 90)));
		System.out.println("============================================");

		System.out.println(set.add(new A(120, 40, 90)));
		System.out.println("============================================");

		System.out.println(set.add(new A(120, 140, 90)));
		System.out.println("============================================");

		System.out.println(set.add(new A(140, 120, 90)));
		System.out.println("============================================");

		System.out.println(set.add(null));
		System.out.println("============================================");

		System.out.println(set.add(null));
		System.out.println("============================================");

		System.out.println(set.add(null));
		System.out.println("============================================");

		System.out.println(set.size());
		System.out.println(set);
	}
}
//first element added successfully
//from second element onwards it checking and adding into the set
//bucket is maintaining the order(using linked list)
//incase of setStream , it allows only null value(we didn't any exception if we add more than one null.simply it won't add into the set)
//while adding null it is not calling hashcode() method, it creates one bucket for null values
//without knowing the hashsode value for null, it is allowing one bucket for null
//only one value is allowed for set