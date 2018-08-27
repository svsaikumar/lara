@interface A
{
	int version() default 10;
	String author();
}



@A(author="abc")
class M5
{
	@A(author = "abc",version=20)
	public static void main(String[] args)
	{

		System.out.println("Hello World!");
	}
}
//annonation definition can have any number of method declarations
//we have to provide a value to all the methods(here version and author are 2 methods)(be default every method is mandatory)
//we can provide sama data to annotaion in further usages
//there should be default value to every method