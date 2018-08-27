class A
{
	static int i;//i is not local to any one.it  is member of class A and it can be used anywhere in the class
	public static void main(String[] args) 
	{
		System.out.println(i);
	}
}
//here i is static member to A
//by default class A is static
//there are 2 static members in class A
//here we can treat 'i' as global variable
//global variable can also called as a property or field or attribute(here that global variable is 'i')
//we can use any global variables straight away without initialization
//every global variable initiaizes with a defalut value automatically
//that default value depends on data type
//for int the defaut Value  is 0
//for double the default value is 0.0
//for boolean the default value is false
//for char it is '\u0000'(it is a unique ASCII code)