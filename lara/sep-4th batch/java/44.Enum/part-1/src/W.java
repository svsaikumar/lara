enum V
{
	//C1, C2, C3;//every constant is static in enum(public and final also)

	V()
	{
		//System.out.println("V()");
	}
}

class W
{
	public static void main(String[] args) 
	{
		//V v1 = V.C3;//here all the members of enum are loading into the memory
		//V v2 = V.C2;//here constants are not loaded as they are already loaded
		//System.out.println(v1);
	}
}
//every enum constant is a object to enum
//mainly enum is for grouping constants. to manage that constant we need constucor , field, method, initiaization block etc
//inorder to use any member of enum that enum  should be loaded into the memory(every static member will load)
//every constatnt loading into the memory, whenever a member is lading, constructrs is executing,
//every constant requires a constructer
//in enum, constructer is executing while every members is loading in to the memory