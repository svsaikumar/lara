import java.util.PriorityQueue;
class Person
{
	String name;
	Integer age;
	Person(String name, Integer age)
	{
		this.name = name;
		this.age = age;
	}
	public String toString()
	{
		return "(" + name + "," + age + ")";
	}
}
class M34 
{
	public static void main(String[] args) 
	{
		PriorityQueue queue1 = new PriorityQueue(
				(o1, o2) ->  (((Person)o1).name).compareTo(((Person)o2).name));
		queue1.add(new Person("Hello", 90));
		queue1.add(new Person("abc", 67));
		queue1.add(new Person("test", 30));
		queue1.add(new Person("check",45));
		System.out.println(queue1);
		System.out.println(queue1.poll());

		System.out.println("====================");

		PriorityQueue queue2 = new PriorityQueue(
				(o1, o2) ->  (((Person)o1).age).compareTo(((Person)o2).age));
		queue2.add(new Person("Hello", 90));
		queue2.add(new Person("abc", 67));
		queue2.add(new Person("test", 30));
		queue2.add(new Person("check",45));
		System.out.println(queue2);
		System.out.println(queue2.poll());
	}
}
//every wrapper class implementing comparable interface(compareTo() method)