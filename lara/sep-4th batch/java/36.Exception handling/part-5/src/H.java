import java.io.Closeable;
class H implements Closeable
{
	public void close() 
	{
		System.out.println("from close");
	}
}
//closeable interface conataing a close method
