import java.lang.annotation.Annotation.Documented;
@interface A//defining annotaion
{
	String someDesc();//String as return type is allowed
}//annotaion definition
@A(someDesc="some desc about class")//the description should be String type only(as return type of method is String)

class M1

{
	@A(someDesc="some desc about main")
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
	}
}
//annotaion should be developed with "@interface"
//while using annotaion also @ is required
//we define an use annonation is same class or defining in one class and usage in another class
//annotations are not for executing any logic, it's only for description