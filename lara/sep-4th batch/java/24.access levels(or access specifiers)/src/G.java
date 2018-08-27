class A 
{
	private A()
	{
	}
}

 class G extends A
{
	/*G()-this is created by compiler by default
	{
		super();
	}
	*/
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//In G class compiler will create defaut no args cons,and it is  calling A consructer (by default super()) 
//which is private so we get error here
//private membes are not inherited to sub class