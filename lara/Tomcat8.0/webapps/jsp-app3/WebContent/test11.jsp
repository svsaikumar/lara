 <jsp:useBean id="e1" 
			 class="com.lara.Employee"/>

<%
	e1.setFirstName("abc");
	e1.setLastName("xyz");
	e1.setAge(22);
%>

<%= e1.getFirstName() %> </br>
<%= e1.getLastName() %> </br>
<%= e1.getAge() %> </br>
