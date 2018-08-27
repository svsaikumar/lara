package pack2;
class G extends pack1.A
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.i);
	}
}
//i is not available in G class as G is in another package
//default socped members can be used in the same package
//package stands for default
//default scope and package scope are same