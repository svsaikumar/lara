/*getclass method*/
class A
{
}//when ever class a loading to the memory at the time one java.lang.class obj creating to A//
//after obj is creating to A//
class M1
{
	public static void main(String[] args)
	{
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		Class c1 = a1.getClass();
		Class c2 = a2.getClass();
		Class c3 = a3.getClass();
		System.out.println(c1==c2);//c1,c2,c3 all are refering to same obj//
		System.out.println(c2==c3);
	}
}
//return type is class..method name is getclass()
//class is not a keyword  ..it is  a name of the class
//in java.lang package class name it self class only
//whenever a class loading to the memory for that class creating obj
//whenever object is loading in to the memory java.lang.object creating
//every imformation is string in to the java.lang.package
//any class loading to the memory one time....when ever abc class loading to the memory one java.lang.class obj storing abc obj imformation
