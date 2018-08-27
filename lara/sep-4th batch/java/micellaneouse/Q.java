class Q 
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("please supply one int CLA");
			System.exit(0);
		}
		int i = Integer.parseInt(args[0]);//converting the value in string array(which is in the form of string) into int type
		int j = i * i;
		
		System.out.println("square of " + i + " is " + j);
	
	}
}
//here int value is stored in  string array.it can't be used as int value straigth way in mathematical operators we have to convert it into int
//supplying that string array as an argument to main method
//wrapper class of int is Integer