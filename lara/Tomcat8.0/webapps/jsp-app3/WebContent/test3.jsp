<jsp:useBean id="person"
			 class="com.lara.Person" 
			 scope="page"/>

<%= person.getHello() %>  </br>

<%
	out.println(person.getHello() + "<br>");
	Person p1 = (Person) pageContext.getAttribute("person");
	out.println(p1.getHello() + "<br>");
%>
<%= p1.getHello() %>
<%@ page import="com.lara.Person" %> 
