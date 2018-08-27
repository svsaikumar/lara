class A
{
	int i;
	A ref;//attribute of same class type
}
class  M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.i = 10;
		A a2 = new A();
		a1.ref = a2;
		a2.i = 20;
		A a3 = new A();
		a3.i = 30;
		a2.ref = a3;
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		System.out.println(a1.ref.i);//a2.i
		System.out.println(a1.ref.ref.i);//(a2).ref.i      as a1.ref = a2;
	}
}
//we are creating 3 objects to class A
//to where a2 is pointing , a1.ref also pointing to there only
//to where a3 is pointing, a2.ref also pointing to there only.now 3rd object ref is null