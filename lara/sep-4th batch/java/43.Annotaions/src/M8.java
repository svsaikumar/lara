@interface A
{
	int version() default 1;
	String author() default "sai";
	String plarform() default "windows";
}
@A(author="abc")
class M8
{
	@A(author = "Manu")//@name of annonation//here version and author is optional as version and author already has default values
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
//if any method declaration has a defauit value, then that methd is optional while using annonation
//here version is optional while using A annonations