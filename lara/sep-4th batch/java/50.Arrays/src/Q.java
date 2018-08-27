class Q
{
	public static void main(String[] args) 
	{
		int[] x = new int[4];
		Object y = x;//autoupcasting from int class to oBject class

		Object z = y;
		System.out.println(x[0]);//y is array type reference, so we can use indexes
		System.out.println(y[1]);//y is not array type reference, so we can't use indexes.so error
		System.out.println(z[2]);//z is not array type reference, so we can't use indexes.so error
	}
}
//here elements can be accessed to only x 
//y and z are ordinary reference varaible not a array type
//while compiling it checks, type of variable
//all are pointing to same array object
//we can't access array index through y and z as they are not array type
//square brackets are not allowed for y and z as they are not array type reference