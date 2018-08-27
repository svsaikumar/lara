class P
{
	public static void main(String[] args) 
	{


		int[] x = new int[4];//x is a data type to one class(already defined in JDK) which is subclass to Object class
		Object y = x;//autoupcasting from int class(x) to object class(y)

		Object z = y;//no need of casting as y and z are of same type
		System.out.println("done");
	}
}
//autoupcasting
//arrays are objects
//x is int array type.yis obejct type
//Object means defintitely derived from one class
//every class is a subclass to object in java
//for every array there is a predefined class
//x is subclass to Object
//array type reference to Object type reference
//without a class we can't define a object