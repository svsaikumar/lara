<% int i = 10; %>
<%= i %> </br>
<%@ include file="test6.jsp" %>
<%= i %>


<!-- test7 internally including test6(which has error) -->





<!-- before including the file test6.jsp, we are declaring 'i' so we didn't get error here -->
<!-- content of the both the files are including into one java file -->
<!-- order is following -->