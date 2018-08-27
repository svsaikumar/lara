class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");


		Object obj = new Object();



		E e1 = (E) obj;//class cast exception
		System.out.println("main end");
	}
}
//here we are trying to downcast to E so we get class cast exception