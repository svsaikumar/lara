/*inorder to represent multiple characters ,multiple ways are available
		1.through char[] array
		2.String object
		3.String buffer object
		4.String builder object

	these are the 4 approaches available in java to represent multiple elements 

for managing multiple characters through char[] array is a difficult task(not advisable) as it is lenghty logic
to avoid this we go for String Class

String class available in java.lang package
it is a final class so we can't develop a subclass to String class
String class implementing comparable interface because of this, String objects can be sorted based on the content
String class implemetnlng serializable interface because of this String objects are eligible for serializable
inside  a String class "toString()" method of object class got overrided because of this 
			-we can print the content of the string object through it's reference variable
inside a String class hashCode() and equals() methods of object class got overrided because of this 
			-we can identify duplicate String objects based on the content
plus(+) operator overloaded to add anything to the String object
operator overloading-assigning more tasks to the same operator
programmer can't overload any operator in java(in java operator overloading is not available)
but + operator already overlaoded in java  to add any thing to the String object(only for String object only it is overlaoded)
we can crate String object without "new" operator also
String objects are immutable(not changable)String object are not modifiable further
if we modified we didn't get any errors or exceptins, a new object is creating with that modifications 





*/