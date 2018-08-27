import java.util.HashSet;
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
class M39
{
	public static void main(String[] args) 
	{
		HashSet set= new HashSet();
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.add(new A(90)));
		System.out.println(set.size());
		System.out.println(set);
	}
}
//eventhough contetn is same inside A class, hashcode() and equals() are not overrided they are acting as oject class methods
//now 2 method checking the memory address not the content of objecct as they are not overrided in A class
//and acting as Object class methods only