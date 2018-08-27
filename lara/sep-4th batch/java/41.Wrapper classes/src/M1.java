class M1 
{
	public static void main(String[] args) 
	{
		int i = 10.5;


		Integer obj1 = new Integer(i);//i(primitive) value storing inside a box(object)-boxing
		 
		Integer obj2 = Integer.valueOf(i);//static value of method//valueof returning a primitive value and storing a value inside object
		int j = obj1.intValue();//value stored inside the object returning to j(unboxing)
		int k = obj2.intValue();
		System.out.println(obj1);
	}
}
//in order to perform any operation on a data type use that corresponding wrapper class
//in 2 ways we can convert primitive to wrapper as follows

//Integer obj1 = new Integer(i);=one way
//Integer obj2 = Integer.valueOf(i);=second way


//valueOf() method takes primitive value as input and returns derived type value(it is a static method)
//intValue() method returns primitive value for given derived data type value(it is non static method)