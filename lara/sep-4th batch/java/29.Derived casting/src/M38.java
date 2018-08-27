class M38 
{
	public static void main(String[] args) 
	{
		A b1 = new B();


		b1.test1();
		System.out.println(b1.i);
		b1.test2();
		System.out.println(b1.j);
	}
}
//always compiler is checking the data type of b1,but not the object
//here b1 is A type.then compiler allows to use A type only ,but not B type.so we get error here