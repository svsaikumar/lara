import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)//Retention = one of the meta annotation
@interface E
{
	String message();
}
/*there are 3 types RententionPolicy 
	SOURCE= Annotaions are to be discarded by the compiler.(annotation description will be available in source file only)
	
	CLASS = Annotations are to be recorded in the class file by the compiler but need not be retained by the VM at run time
			(annotation description will be available not only  in source file but also in class file but not in runtime)
	RUNTIME = Annotations are to be recorded in the class file by the compiler and retained by the VM at run time, 
			  so they may be read reflectively
			  (annotation description will be available not only  in source file but also in class file but and loaded into 
			  the memory during execution)
*/