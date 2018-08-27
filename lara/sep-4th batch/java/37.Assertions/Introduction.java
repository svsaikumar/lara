
//assertions are used for rising assertion error whenever something going wrong
//in java 4 keyword are there -return, continue, break, throw which is to be the last statement of the block
/*there are 2 types of assertion statements
					-VSA(very simple asssertion)-syntax is "assert boolean expression;"
					-SA(simple assertion)-synatx is "assert boolean statement: something;

	assert can receive any type of boolean statement, Call a method which returns a boolean, boolean expressions, boolean variable
	we can call method after colon, which return type is not void(for 2nd type)
	there should not be blank after colon(for 2nd type)
	by default no assert statement will execute
in order to execute any assert statement we have to supply any virtual machine argument(VM)
that argument should be -ea   (or)  -enable assertions
to disable assert statement explicitlt  -da  (or) -disableassertions

we can enable or disable assertions in 3 different ways
						-executionwise
						-a particular package wise
						-a particular class wise