class A
{
	A() throws ClassNotFoundException
	{
	}
}
class  X extends A
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//no matter we are using cons or not, the developed cons should be syntactically correct
//super class is throwing checked exeption then there should be try-catch or thrown in subclass
