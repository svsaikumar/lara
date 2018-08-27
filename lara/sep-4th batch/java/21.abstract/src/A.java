abstract class A
{
	void test1()//implemented method.for this we should not use abstract keyword
	{	
	}

	A()
	{
		super();
	}
	abstract void test2();//abstract method(only declared)
}
//test1() method is defined method or implemented method or concrete method(these methods are ready to use)
/*test2() doesn't have a body and ending with a semi-colon.these are called as declared methods or unimplemented methods or abstract methods
	this type of methods should be represented with "abstract" keyword explicity

	if something has to implement further, then we use abstract
	abstract is used if something is not fully developed
	it is used for speciying something which is not fully developed

	*/

//if class containing min one abstract then that class should be delared as abstract class
//we can generate class file to abstract class(generates by compiler)