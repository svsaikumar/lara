package pack1.pack11;
public class M
{
	public static void test2()
	{
		System.out.println("pack1.pack11.M.test2 begin");
		assert false;
		System.out.println("pack1.pack11.M.test2 end");
	}
}
//-ea -da:pack1...pack1.L
//-ea:pack2.N pack1.L
//-ea enabled for any where
//-ea -da enables for any where
//-ea:pack2... -da:pack2.pack22.O pack1.L
//specifying package wise and class wise
//one user -a and another one without -a ,this one is not mandatory
