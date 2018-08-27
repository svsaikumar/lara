<% int i = 10; %>
<%= i %> </br>
<% i = 30; %>
<%@ include file="test6.jsp" %>
<%= i %> </br>
<% i = 50; %>
<%@ include file="test6.jsp" %>
<%= i %> </br>



<!-- we can share the variables between the jsp's while considering the order -->