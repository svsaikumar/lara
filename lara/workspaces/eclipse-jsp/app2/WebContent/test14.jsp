i am from test14.jsp</br>
<jsp:include page="test13.jsp" /> </br>
<%= i %>

<!-- here both the jsp's are not  mixing so we get exception -->
<!-- we can't use local variable of one class in another class -->
<!-- i is declared in service(local method) of jsp -->
<!-- in action include we can't share the variables in between the jsp's -->