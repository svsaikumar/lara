
/*RequestDispatcher is a interface(javax.servlet package)
it's protocal independent(we can use it in any protocal requests)
it is used for dispatching a request from a servlet to any other resource
that another resource can be a servlet, html, jsp....etc
there are 2 ways to get a object of type 'RequestDispatcher'
	1.By using Request Object
	2.By using ServletContext Object

after getting a RequestDispatcher we use it in 2 different ways
	1.for forwarding the request(by using 'forward()' method)
	2.for including the request(by using 'include()' method)
	
*/
