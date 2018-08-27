//we can store any type of elements in the collection
//entire collection API is available in java.util package
//collections is a utility class
//collection is used for list type


//we can use enhacd for loop of collection type(list, set, queue)
//we can use enhacd for loop of "map"

/*list
	arrays
	vectors class
	linked list1
*/
//the main purpose of list is maintaining the order
//every element automatically assigning with index
//we can read any element of the list by specifying it's index(by using get() method)
//list allows duplicates
//list allows null values
//under list, "vector" is a synchronized one
//Arraylist is internally using 'array' to manage the elements
//we can add elements into the ArrayList by using add() method which adds any type of data at the end of the list
//another add() method which takes 2 arguments where first argument is (location)index value and second argument is element value
//addAll() method adds a list of elements of one arraylist elements into anothr arraylist
//another addAll() method which takes 2 arguments where first argument is (location)index value and second argument is list of element value
//while creating ArrayList we can send the values of current Arraylist to  another ArrayList through constructer

to read the elments from the ArrayList
=======================================
//in all the collection API classes toString(), equals() and hashcode() got overrided
//we can read through toString() method
//calling get() method by  supplying element's index as the argument to that get() method
//we can read through 'enhanced for' loop and normal 'for' loop
//in normal "for" loop(classical for loop) again we have to use get() method but not in "enhanced for" loop
//iterator() to read the elements of list type
//list iterator() also can be used
//enumeration  also can be used

updating the existing element
=============================
//set() method is used to replace the specific existing element in the Arraylist

removing the elements
=====================
//there are 2 remove methods (remove())
	//one method is by removing by specifying  index element by sending the index value as argument
	//another method which  object itself has to be suplied as an argument to remove() method
	//removeAll() which removes the multiple list of specified elements from ArrayList
	//retainAll() is used to retain the specific elements and removing all other elements (opposite to removeAll() method)
	//removeRange() is used to remove the elements from certain range
	//removeRange() is protected in ArrayList.so we can't call it by using reference of the ArrayList directly
	//we have to call by developing the subclass
	//clear() which removes every element from the ArrayList


//Collections.sort() for sorting the elements in the ArrayList

searching
==========
//for searching the specific element in the ArrayList use "Contains()" method(retruns boolean)
//in order to find the location(index) of the specific element we have to use "binarysearch()" method(if not find it is not returning fixed number)
//we can do binarysearch() after  sorting only

//if we want to search in the reverse order we have to supply "reverseComparator()" as a second argument to binarysearch() method
//where first arg is Arraylist


=======================================
=======================================
=======================================
//add(element)- return type is "boolean"

//add(int, element) -return type is "void"

//get() method return type is "element type"(which is present in it)

//size() method return type is "int"

//listAll() method return type is "boolean"

//remove() method  return type  is "boolean"

//removeAll() method return type  is "boolean"

//clear()  method whose return type "void"

//retainAll() method return type is "boolean"

//removeRange() method  return type is "void"

//set()  method  return type "void"

//sort()  method  return type is "void"

//contains()  method  return type is "boolean"






