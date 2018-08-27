class Z1
{
	final static int i = 10;

	static
	{
		i = 10;
	}
}
//error- trying to re-initialize
//static  members are loaded into the memory only one time
//final static global variabele is constant for entire execution
//static and final are considered as perfect constants