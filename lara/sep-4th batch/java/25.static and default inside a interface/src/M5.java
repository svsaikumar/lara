interface M5
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//it is possible to incorporate main method also in interface(from JDK 1.8)
//static defined blocks can be accessed by using interface
//static methods cannot be an abstract
//combination of static and abstract is illegal in inside interface
//abstract methods can't be static
//inside interface we can implement any number of static  methods , any number of  non static methods can be declared 
//abstract non static are inheriting to the subclass
//static implemented methods are limited to the current inteface(not available to subclasses)
//non static declared methods(abstract methods) are inheriting to subclass
