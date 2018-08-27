class  Z7
{
	public static void main(String[] args) 
	{
		int[] elements = {10,20,30,40};
		//for-each  (or) enhanced for loop
		for(int element : elements) //JDK 1.5
		{
			System.out.println(element);//inside body, element is used directly	
		}
	}
}
//this 'for' loop is only for reading every element of array (or) collection object
//this 'for' loop contains only 2 sections.In this colon(:) is a separator
//before colon we shoud declare a varible
//after colon we should specify an array
/*there are 3 conditions to be followed by for - each loop
	-data type of the variable should be array data type
	-the variable which we required  the for loop should not be declared before
	-we should not intialize a variable 
*/
