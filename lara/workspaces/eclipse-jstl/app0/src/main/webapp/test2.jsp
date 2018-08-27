<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page isELIgnored="false" %>
<c:forTokens items="abc;xyz;hello" delims=";" var="obj">
	${ obj } <br>

</c:forTokens>