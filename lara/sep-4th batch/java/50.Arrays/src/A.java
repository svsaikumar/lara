class  A
{
	public static void main(String[] args) 
	{
		int[] x = new int[];//primitive type array(int)


		double[] y = new double[9];//primitive type array(double)

		String[] z = new String[20];//derived type array(String)
		Object[] p = new Object[15];//derived type array(Object)
		A[] q = new A[10];
		System.out.println(x.length);
		System.out.println(y.length);
		System.out.println(z.length);
		System.out.println(p.length);
		System.out.println(q.length);
	
	}
}
//incase of Arrays, "length" is a property or attrubute or field which finds the length of the Array
//incase of Strings, "length()" is a method which finds total number of characters in the String
