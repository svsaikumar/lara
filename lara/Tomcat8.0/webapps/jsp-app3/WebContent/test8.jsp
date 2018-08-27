<%@ page import="com.lara.Person" %>

<%
	Person obj = (Person) session.getAttribute("p1");
	out.println(obj.getHello());
%>
</br>
	I am from test8.jsp 