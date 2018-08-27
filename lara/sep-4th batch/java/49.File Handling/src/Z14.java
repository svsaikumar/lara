import java.io.Console;
class  Z14
{
	public static void main(String[] args)
	{

		Console c1 = System.console();
		Console c2 = System.console();
		Console c3 = System.console();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
//we can't create object to console by using new opertor as it contains only private constructors
//while java program is running from interactive command window jvm creates one console object ,that console object reference can be retreived through system.console
//while running this in eclipse we get c1,c2 and c3 as null
//only one console object for entire application
//inside system.class static console() method.it is returning to 
//we are getting referernce of same object in output
//console class is avalilable in 
//console class has only private constructers
//we will get the referecner variable of console by calling system.console