import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Target(ElementType.METHOD)//Target=meta annotation because it is using to describe another annotation
@interface D//definition D annotation
{
	String message();
}
//using target annotation while define D annotation
//if any annotaion is used to describe another annotation then it is called as meta annotation