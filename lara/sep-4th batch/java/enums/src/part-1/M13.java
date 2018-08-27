package pack1;
enum I
{
	CON1,CON2,
	CON3
	{
		void test()
		{
			System.out.println("cscb-test");
			// constant specific class body
			// for particular constant we can modify any method we use some class body -- mainly for methods 
		}
	},CON4,CON5;
	// we are using 5 constant and 1 method 
	void test()
	{
		System.out.println("generic-test");
		// this is common for every constant
	}
}
class M13
{
	public static void main(String[] args)
	{
		I obj1=I.CON1;
		I obj2=I.CON2;
		I obj3=I.CON3;
		I obj4=I.CON4;
		I obj5=I.CON5;
		obj1.test();
		obj2.test();
		obj3.test();
		obj4.test();
		obj5.test();
		System.out.println("done");
	}
}

// 

// output : generic-test
//			generic-test
//			cscb-test
//			generic-test
//			generic-test
//			done
