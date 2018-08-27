package pack2;
import pack1.A;
class D
{
	public static void main(String[] args) 
	{

		A a1 = new A();
		System.out.println(a1.i);
	}
}
//here D is in pack2, and we are trying to access A from another pack1 which is not possible in case of default scoped member
//default scoped members can't be used in another packages