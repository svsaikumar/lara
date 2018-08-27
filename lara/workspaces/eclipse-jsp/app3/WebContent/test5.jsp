<%@ page import="com.lara.Person" %>
<%
	Person obj = (Person) request.getAttribute("p1");
	out.println(obj.getHello());
%>
<br> from test5.jsp 
	
	
	
<!-- here we are retirving person object from request object -->