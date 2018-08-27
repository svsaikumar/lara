class A 
{
}
class B extends A
{
}
class C extends B
{
}

class D
{
	B test()
	{
		return null;
	}
}
class E extends D
{
	A test()//overriding
	{
		return null;//here we are not supplying subclass return type so we get error here
	}
}
class M10
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

//we can't supply a superclass return type in the place of subclass type
//here A is not the subclass of C.it is a super class for C class



/*
the covariant return types are newly introduced since Java 5.0, and used during method overriding.
Covariant return type allows us to change the return type of the overriding method in the subclass;
however this return type in subclass method must be a subtype of super class method return type.
*/


/*
Covariant, Contravariant and Invariant

The subtyping principle which we discussed is called covariant.
The reverse of it(instead of child replacing the parent,the reverse of it as parent replacing the child) is called contravariant. 
If no subtyping is allowed then, it is called invariant.

*/