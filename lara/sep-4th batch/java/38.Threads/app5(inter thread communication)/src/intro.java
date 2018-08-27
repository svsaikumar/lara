class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
/*
	wait()-available in the object class(every object) 
	notify()-available in the object class (every object)
	notifyAll()-available in the object class (every object)

	*/
//if any method is available in object class then it is inheriting to any subclass
//all the above method are not synchronized methods
//any thread can call all the above 3 methods
//any method can call all the above 3 methods
//all 3 methods should be called from synchronized methods or synchronized blocks
//all 3 methods can't be called from outside of synchronized methods or synchronized blocks