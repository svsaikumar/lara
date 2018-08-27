interface  B
{
	static void test()
	{
		System.out.println("A_test()");
	}
}
interface B extends B
{
}
class M3
{
	public static void main(String[] args) 
	{
		B.test();//error here
		System.out.println("done");
	}
}
//static defined methods inside interface are only for that interface,but  not for sub-interfaces
//inside interface if we want to provide unavoidable implementation inside interface that can be done through static method only
//and that static defined methods availale only for that interface only that will not be sharing to sub interfaces
//
 