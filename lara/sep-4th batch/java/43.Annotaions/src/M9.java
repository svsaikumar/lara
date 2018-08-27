@interface A
{
	int[] versions(); 
}
@A(versions={1, 2, 3})
class M9
{
	@A(versions={1, 2, 3})
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
//annonations can also have array of primitive also.
//if 