import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//Retention = one of the meta annotation
@interface F
{
	String message();
}