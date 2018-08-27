class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");


		int i = Integer.parseInt("abc");//number format exception
		System.out.println("main end");
	}
}
//we are trying to convert string(which has alphabet) into integer
//if that string contains number then it is fine


//