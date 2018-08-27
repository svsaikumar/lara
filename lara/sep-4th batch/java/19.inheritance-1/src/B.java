// INHERITANCE is a process by which objects of one class acquire the properties of objects of another class
// A is super-class(generic or generalized class) and B is sub class(special or specializsed  class)
//A is parent class and B is child class

class A
{
	
	int i;
}
class B extends A //EXTENDS is a keyword which is used for achieving inheritance.here every member is inheriting to B
{					// extend keyword should be a solid line from sub class to super class
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
// INHERITANCE is a process by which objects of one class acquire the properties of objects of another class
/*inhertiance can be achieved in 2 different ways
	-extends
	-implements
*/
//here when obj is creating  in B class, not only j, i also loaded into the memory
