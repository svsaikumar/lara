class A < X >
{
	X obj;
}
class M11
{
	public static void main(String[] args) 
	{
		A<Integer> a1 = new A<Integer>();
		A<String> a2 = new A<String>();
		A<Double> a3 = new A<Double>();
		A a4 = new A();
		a1.obj = 40;
		a2.obj = "abc";
		a3.obj = 4.5;
		a4.obj = 5;//here 'obj' data type is "Object"
		a4.obj = "uuj5";//here 'obj' data type is "Object"
		System.out.println("done");
	}
}
//'obj' data type changing from one object to another object
//obj data type is X(X can be any data type)

