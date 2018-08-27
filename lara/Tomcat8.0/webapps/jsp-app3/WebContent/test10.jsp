<%@ page import="com.lara.Person" %>

<%
	Person p1 = (Person) application.getAttribute("p1");
	out.println(p1.getHello());
%>
</br> i am from test10.jsp