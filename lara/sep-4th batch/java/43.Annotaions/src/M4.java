@interface A
{
	int version();
	String author();
}



@A(version=10, author="abc")

class M4
{
	@A(version=20)//here we get compile time error because we are not providing all the methods of annotation
	public static void main(String[] args)
	{

		System.out.println("Hello World!");
	}
}
//annonation definition can have any number of method declarations
//we have to provide a value to all the methods(here version and author are 2 methods)(be default every method is mandatory)
//we can provide sama data to annotaion in further usages
//there should be default value to every method