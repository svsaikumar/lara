test20 begin</br>
<jsp:forward page="test21.jsp">
	<jsp:param name="p1" value="123"/>
	<jsp:param name="con1" value="oracle"/>
</jsp:forward>
test20 begin</br>
<%= request.getParameter("p1") %> </br>
<%= request.getParameter("con1") %> </br>