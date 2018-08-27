class S 
{
	final int i;
	S()
	{
		
		i = 10;
	}
	
	S(int x)
	{
		i = 20;
	}	
}
//we can re-assign a value to a final variable any number of times in constructers(only once in a constructer)
//because while one constructer is executing the other constructer will not execute
//constructers overlaoding -multiple constructers
//if there are multiple constructer then there are multiple ways of objects creation
//whenever we are developing multiple cons in a class then they should have different signature
//non-static final global valriable is a constant for only one object but not for entire class