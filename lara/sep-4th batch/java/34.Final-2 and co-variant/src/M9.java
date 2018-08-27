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
		return null;//for derived data type we can supply null
	}
}
class E extends D
{
	C test()//overriding
	{
		return null;//for B we can send it's subclass return type (here C is subclass of B)
	}
}
class M9
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

//if we use any one of the subclasses return type then it is co-variant
//return type can be subclass type




//overloading
//different signature with same name
//all overlaoded methods can be final or few can be final

//overriding(or implementation)
//same signature
//if we want to same method in the subclass that it should be also static(it is not overrididng)
//if superclass method is final we can't override it in it's subclass
//if superclass method is public we can override in subclass with public only
//if superclass method is private then it not inherited to subclass then there is no question of overriding
//return type should be same in superclass and subclass for overriding
//if superclass method return type is derived the we can go for same derived return type or subclass return type of that derived class
//becaue subclass contains all the members of superclass
//but we can't use superclass when subclass is required because subclass contains a new members.then we have to go for downcasting
//whereer we required superclass there we can supply subclass
