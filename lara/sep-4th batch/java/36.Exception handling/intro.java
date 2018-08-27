
//throwable is the supermost class 
//by using throwable, error class and exception class are developed
//we can handle both exception object and error object
//both are related to abnormal conditions
//exception-
//error-
//exception is raised due to abnormal condition in a java statement
//if any java statement raising abnormal condition then it is exception oject
//
//if any external resources caused an abnormal condition in java file then it is error object
/*under exception ther are several classes  -class not found exception
											-clone not supported exception
											-IO ecxeption
											-file not found exception
											-interrupted exception
											-parse exception
											-SQL exception
			-here compiler is not handling the exception it's just alert us to handle them
			-checked exceptions also depend on runtime paramaters but less than unchecked exceptions

	from the same exception class, one more exception is derived i.e., run time exception
																-arithmetic exception
																-null pointer exception
																-number format exception
																-array index out of bounds exception
																-array out of bounds exception
																-class cast exception(these all are unchecked exceptions)

																			
		run time exception inherited from exception
		exception inherited from throwable

	-all these classes are for only abnormal conditions due to java statements.if java statement is producing any abnormal 
	condition then exception object is rised


	errors  -stack over flow
	     	-out of memory error
		    -noclass def found error
			-no such method found error
			-assertion error
		
there is one more classification
				- checked type-compiler verified the exceptions
				- unchecked type-least worrying about the exception
			all run time exception and error type are unchecked exception


	throwable class and exception class, both are treated as semi-checked
	