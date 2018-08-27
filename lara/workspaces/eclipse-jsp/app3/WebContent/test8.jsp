<%@ page import="com.lara.Person" %>

<%
	Person obj = (Person) session.getAttribute("p1");
	out.println(obj.getHello());
%>
</br>
	I am from test8.jsp 
	
	
	
<!-- person object getting from sessionObject(if we want to hsre use besdn obj ot multiple(different) req of same user,use session object -->