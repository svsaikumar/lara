class E 
{
	E()
	{
		System.out.println("E()");
	}
	
	{
		System.out.println("E-IIB");
	}
	public static void main(String[] args) 
	{
		E e1 = new E();
		System.out.println("=========");
		E e2 = new E();
		System.out.println("=========");
	}
}
//IIB - instance initialization block(without a name and without  keyword)
//for every object creation iib will execute(like constructer)
//IIB is prefered than constructer