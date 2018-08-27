class M4
{
	public static void main(String[] args) 
	{




		boolean flag = false;
		Boolean b1 = new Boolean(flag);
		Boolean b2 = Boolean.valueOf(flag);//static value of method

		boolean i = b1.booleanValue();
		boolean j = b2.booleanValue();
		System.out.println(i);
		System.out.println(j);
		System.out.println("done");
	}
}
//in order to perform any operation on a data type use that corresponding wrapper class
//obj1, obj2 are wrapper classes
//