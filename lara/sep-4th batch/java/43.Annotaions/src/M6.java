@interface A
{
	int version() default 1;
	String author();
}



@A(author="abc")
class M6
{
	@A(author = "abc",version=20)
	public static void main(String[] args)
	{

		System.out.println("Hello World!");
	}
}
//if any method declaration has a defauit value, then that methd is optional while using annonation
//here version is optional while using A annonations