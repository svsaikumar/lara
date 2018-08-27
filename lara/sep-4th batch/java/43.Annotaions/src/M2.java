@interface A//defining annotaion
{
	int someDesc();//int as return type is allowed
}//annotaion definition
@A(someDesc=10)//the description should be int type only(as return type of method is int)
class M2
{
	@A(someDesc=20)
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}	
//while using annotation to describe it should be on the top of the corresponding usage
//if we are assigning any value to annotain other than int is not allowed here, as return type is int
//through annotatin we can provide comment syntactically