<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
  
  
  
  
<c:set var="date" value="12-06-2018"/>
<fmt:parseDate var="today"  value="${date }" pattern="dd-MM-yyyy"/>

<c:out value="${today}"/>



</body>  
</html>