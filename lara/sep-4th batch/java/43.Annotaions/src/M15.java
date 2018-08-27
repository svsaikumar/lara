import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

@Retention(RetentionPolicy.RUNTIME)
@Inherited//another meta annotation
@interface A
{
	String message();
}

@Retention(RetentionPolicy.RUNTIME)
@interface B
{
	String message();
}

@A(message="abc")
@B(message="abc")
class C//described C class with A and B
{
}
class M15 extends C//Only A annotation is inheriting to subclass.B annotation is not inheriting to M15
{					//M15 is subclass to  C
	public static void main(String[] args) throws Exception
	{
		Class c1 = Class.forName("M15");
		Annotation[] annotations = c1.getAnnotations();
		for(Annotation annotation : annotations)
		{
			System.out.println(annotation);
		}
	}
}
		
//@Inherited = annotations are  also inherited to subclass(if that annotatin has @Inherited)