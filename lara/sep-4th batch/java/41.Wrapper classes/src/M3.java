class M3
{
	public static void main(String[] args) 
	{





		Character obj1 = new Character('a');
		Character obj2 = Character.valueOf('a');//static method valueOf()

		char c1 = obj1.charValue();
		char c2 = obj2.charValue();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("done");
	}
}
//in order to perform any operation on a data type use that corresponding wrapper class
//obj1, obj2 are wrapper classes
//