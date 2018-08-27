class Z12 
{
	public static void main(String[] args) 
	{


		String[][] x= new String[4][];
		x[0] = new String[5];
		System.out.println(x[2].length);
	}
}
//nullpointer exception because we didn't define inner array(inner arrays will be null)
//every array is a derived data type, default value is null
//x[2] is null, we are calling length method so we get null pointer exception
//x[0], x[1], x[3] are also null

//size of array can't be changed. it is fixed
//here x[0], x[1], x[2], x[3] are null