enum G
{
	CON1, CON2, CON3, CON4//(if enum contains only constants then ";" is optional
}
class H
{
	public static void main(String[] args) 
	{
		G g1 = G.CON1;
		G g2 = G.CON4;
		System.out.println(g1);
		System.out.println(g2);
	}
}
//both are non-public we can save it with any name(but we have to run with H class)
//inside enum fixed number of ordered unique constants(which means static and final are perfect constants)