<jsp:useBean id="p1" class="com.lara.Person" scope="request"/>

<jsp:forward page="test5.jsp"/>
 
<!--  here scope is request, person object is storing in request object with key as id value 'p1' -->