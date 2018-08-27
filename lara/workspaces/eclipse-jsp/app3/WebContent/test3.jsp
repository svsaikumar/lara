<jsp:useBean id="person" class="com.lara.Person" scope="page"/>

<%= person.getHello() %>  </br>








<%
	out.println(person.getHello() + "<br>");
	Person p1 = (Person) pageContext.getAttribute("person");
	out.println(p1.getHello() + "<br>");
%>
<%= p1.getHello() %>
<%@ page import="com.lara.Person" %> 


<!-- the default scope is page only for use beantag-->
<!-- that means we can't use this id in another page -->
<!-- person object is stored in pageContext object(one of the implict object in jsp) with key as id as 'person'-->
<!-- by using getAttribute() we can retrive from pageContext object -->
