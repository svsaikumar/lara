@interface A
{
	int version() default 1;
	String author() default "sai";
}
@A(author="abc")
class M7
{
	@A//@name of annonation//here version and author is optional as version and author already has default values
	public static void main(String[] args)
	{

		System.out.println("Hello World!");
	}
}
//if any method declaration has a defauit value, then that methd is optional while using annonation
//here version is optional while using A annonations