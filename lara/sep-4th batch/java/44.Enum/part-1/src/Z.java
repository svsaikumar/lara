class Z 
{
	enum B
	{
		CON1(10), CON2(30), CON4(50);


		int i;

		B(int i)
		{
			this.i= i;//b1.i;//b2.i;
		}
	}
	public static void main(String[] args) 
	{
		B b1 = B.CON4;
		System.out.println(b1);
		System.out.println(b1.i);

		B b2 = B.CON2;
		System.out.println(b2);
		System.out.println(b2.i);
	}
}
//whenever constant is loading , i also loading
//object in case of class and constant incase of enum are same
//enum is almost similar to class
//constant is almost similar to object