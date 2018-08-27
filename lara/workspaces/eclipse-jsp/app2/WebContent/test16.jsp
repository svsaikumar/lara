i am from test16.jsp begin</br>
<jsp:include page="test17.jsp">
	<jsp:param name="param1" value="hello"/>
	<jsp:param name="abc" value="test"/>
</jsp:include>
I am at the end of the test16.jsp </br>
at the end :
<%= request.getParameter("param1") %> </br>
<%= request.getParameter("abc") %> </br>