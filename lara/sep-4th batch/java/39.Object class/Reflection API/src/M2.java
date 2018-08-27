class A
{
}
class M2
{
	public static void main(String[] args) throws Exception
	{
		A a1 = new A();
		Class c1 = a1.getClass();
		Class c2 = A.class;
		Class c3 = Class.forName("A");//specfying class name in the form of String
									//for this we need throws Exception
									//recomended this approach
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println(c1==c2);
		System.out.println(c2==c3);
	}
}
//getClass();   A.class; Class.forName("A");-different approaches to get  java.lang.Class object
//			all these returns the reference variable of java.lang.Class object of corresponding class

//c1, c2, c3 referingg to same object
//for every class there is one java.lang.Class object
