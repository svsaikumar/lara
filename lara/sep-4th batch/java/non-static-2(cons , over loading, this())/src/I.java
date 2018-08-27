class I 
{
	
	I()
	{
		System.out.println("I()");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		I i1 = new I();
		System.out.println("===========");
		I i2 = new I();
		System.out.println("===========");
		I i3 = new I();
		System.out.println("main end");
	}
}
//for every object creation constructer is executed(here it exeutes 3 times as 3 objects are created)
//but SIB execute only once while loading the class
