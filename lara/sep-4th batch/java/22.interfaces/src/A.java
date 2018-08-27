abstract class A
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
	abstract void test4();
	
}
//no class can be 100 % abstract eventhough every method is abstract because of constructer(default cons)
//constructer is not static as it is involving in one of the non static intialization, not abstract, it is concrete.
//constructer should not be abstract because of they ara not involving in inheritance.if it is not inherited to sub class where abstract cons can be implemented
//while declaring something as absract it should be implemented further.we can't inherihit constructer to subclass and cons is not imolemented
//if we need 100% abstract then we should go for interface(interface is 100% abstract)