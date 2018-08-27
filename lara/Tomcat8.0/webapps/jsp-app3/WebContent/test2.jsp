<jsp:useBean id="obj" 
			 class="com.lara.Person" />

<%= obj.getHello() %> </br>

<%
	String s1 = obj.getHello();
	out.println(s1 + "<br>");
	out.println(obj.getHello() + "<br>");
%>
 