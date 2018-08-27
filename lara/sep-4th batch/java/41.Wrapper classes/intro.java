
//for every primitive data type there is corresponding wrapper class


//primitive data type			wrapper class
=====================			================
1.byte							Byte
2.short							Short
3.int							Integer
4.long							Long
5.float							Float
6.double						Double
7.char							Character
8.boolean						Boolean

//all wrapper classes are available in java.lang.package
//because of members of java.lang.package there is no need of import statement(import java.lang.package), we can use directly
//all wrapper classes are final classes(then every wrapper class is concrete class as it is final)
//we can create objects to these classes directly
//as all are final classes we can't develop subclass to wrapper class
//all wrapper classes implementing comparable interface becaue of this we can sort wrapper objects based on thecontent
//all wrapper classes implementing serializable interface because of this we can serialize wrapper objects
//in all wrapper classes, toString() method of object class got overrided because of this we can print the content of the object through it's reference varaible
//in all wrapper classes equals() method and hashcode() method of object class got overrided because of this collection API able to identify uninqueness based on the content of  the wrapper object
/*wrapper classes are used for 
	1.wrapping primitive content into object(boxing)
	2.unwrapping primitive content from the objecta(unboxing)
	3.converting primitive to String
	4.converting String to primitive
	5.for every primitive data type several utility activities can be performed through wrapper classes
	6.except in character wrapper class in all other wrapper classes we can find conversion of string to primitive
	
//