class F 
{
	int i ;
	 
	void test1()
	{
		System.out.println("from test-1:" + i);
		i = 10;//compiler replaces this line as "this.i" as 'this' is a default reference variable in non-static block
		test2();//compiler replaces this line as "this.test2()"
	}
	
	void test2()
	{
		System.out.println("from test-2: " + i);
		i = 20;//compiler replaces this line as "this.i"
	}
	
	public static void main(String[] args) 
	{
		
		F f1 = new F();
		f1.i = 30;
		System.out.println("from main-1: " + f1.i);
		f1.test1();
		System.out.println("from main-2: " + f1.i);
		f1.i = 40;
		f1.test2();
		System.out.println("from main-3: " + f1.i);

	}
}
//if 'this' is available by default in non-static definiton blocks,here there is no need to represent as "this.i" in non-static blocks
//therefore,we can use any non-static member in another static block straight away
//every non-staic member has to be used along with the reference variable becaue they are not loading into the memory while compiling
//when object is created then only the non static members are loding to the memory
//in static definition blocks there is no defalut variable we have to create our own reference variable
//inorder to create an object for class then that class should be  available in the memory for any purpose
//before the object creation, class is loading to the memory
//we can use static  members any where as they are loaded to the memory while loading the class
//when we are using static membrs in another class then it should used along with the class name