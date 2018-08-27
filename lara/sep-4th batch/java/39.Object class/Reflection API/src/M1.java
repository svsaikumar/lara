class A
{
}
class M1
{
	public static void main(String[] args) 
	{
		A a1 = new A();//here A class is loading to the memory and creating one java.lang.Class object to class A
						//we are not creating that object
						//java.lang.Class object refernece can be achieved through getClass() method 
						//as that method returns reference variable

		A a2 = new A();//here A class is not loading to the memory as it is already loaded
		A a3 = new A();//here A class is not loading to the memory as it is already loaded
		Class c1 = a1.getClass();//reference of java.lang.Class obj is returning to c1
		Class c2 = a2.getClass();//reference of java.lang.Class obj is returning to c2
		Class c3 = a3.getClass();//reference of java.lang.Class obj is returning to c3

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println(c1 == c2);
		System.out.println(c2 == c3);
	}
}
//when A class laoding to the memory, one java.lang.Class object is creating to Class A
//all objects are belonging to A class only, for all objects one Class object is creating in the memory
//c1,c2,c3 all are refering to same object(java.lang.Class object)
//a1,a2,a3 all are reference varaibles of 3 objects
//getClass() method inherited from Object class
//return type of getClass() is reference