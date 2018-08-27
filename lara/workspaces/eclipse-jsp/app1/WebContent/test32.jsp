<%@ page extends="com.lara.MyHelloServlet" %>
<%
	out.println(getHello() + "<br>");
	out.println(getHello() + "<br>");
%>

<!-- for multiple jsp's, if we want to develop any common code, then develop that code in the subclass to HttpJspBase class -->
<!-- here that subclass is "MyHelloServlet" class -->
<!-- test30.jsp and test31.jsp are using the common method "getHello" which is developed in MyHelloServlet which is subclass to HttpJspBase -->