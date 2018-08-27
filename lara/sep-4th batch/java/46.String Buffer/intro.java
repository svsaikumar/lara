//string buffer and string builder both are final classes
//in both the classes object class toString() method got overrided.
		//because of this we can print content of the object through it's reference variable
//inside StringBuffer and StringBuilder equals() method and hashcode() method are not overrided
		//because of this we can't identify the duplication(equality) based on the content



//stringBuffer and stringBuilder both are not implementing comparable interface
	//because of this we can't sort based on the content
//stringBuffer and stringBuilder both are not implementing serializable interface
			//because of this we can serialize StringBuffer and StringBuilder object
//we can't create an object ot StringBuffer of Stringbuilder without a 'new' operator
//we can't add anything to StringBuffer or stringBuilder with '+'  operator
//stringBuffer object and stringBuilder object both are mutable(changable)
//there is a append method to add any content to stringBuffer and StringBuilder object
//inside StringBuffer and StringBuilder there is a built in reverse method to reverse the content of the String
//we can delete the content through a delete method in stringBuffer and stringBuilder
//StringBuffer and StringBuilder both are maintaining a buffer
//there is a buffer concept 
//default buffer size is 16 characters
//after filling 16 characters, buffer is automatically increasing