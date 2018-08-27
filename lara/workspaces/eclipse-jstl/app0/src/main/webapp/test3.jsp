<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>






<%
	String[] elements = { "hello", "abc", "xyz", "test" };
	request.setAttribute("results", elements);

%>

<c:forEach items = "${ results }" var="obj">
	${ obj } <br>
</c:forEach>