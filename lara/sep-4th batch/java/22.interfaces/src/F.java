interface F
{
	 int i = 10;// by defalut every member of interface is public.here i is public



	
	void test1();//test1 is public.But not F.
}
//we can use only constants and abstract methods(declared methods) inside interface.defined methods are not allowed
//no implemantation ,no  behaviout , no definition blocks can be provided inside interface

//by default every member of interface is public
//interface is not public by default
//every constant is a final and static along with the public inside interface
//here i is a public, static and final
//here test1 is abstract and public
//be default inside interface ,methods are  abstract along with the public.so abstract keyword is optional