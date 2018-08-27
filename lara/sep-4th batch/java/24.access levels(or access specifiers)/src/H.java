class A 
{
	private int i;
}
class H extends A
{

	public static void main(String[] args) 
	{
		H obj = new H();
		System.out.println(obj.i);
	}
}
//private membes are not inherited to sub class
//here i is not available (it is not inherited as i is private in class A) in H class