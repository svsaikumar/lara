<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
  
  
  
 <c:set var="date" value="<%= new java.util.Date() %>"/>
 <table border="1">
 	<tr>
 		<td width="100%" colspan="2">
 		<p>
 		  <b>
 		  	Formatting:
 		  	<fmt:formatDate value="${date}" type="both" timeStyle="long" dateStyle="long"/>
 		  </b>
 		 </p>
 		</td>
 	</tr>
 </table>
 <table border="2">
 	<tr>
 		<td width="100%" colspan="2">
 		<p>
 		  <b>
 		  	Formatting:
 		  	<fmt:formatDate value="${date}" timeStyle="medium" dateStyle="medium"/>
 		  </b>
 		 </p>
 		</td>
 	</tr>
 </table>
<table border="2">
 	<tr>
 		<td width="100%" colspan="2">
 		<p>
 		  <b>
 		  	Formatting:
 		  	<fmt:formatDate value="${date}" type="both" timeStyle="medium" dateStyle="medium" timeZone="${us }"/>
 		  </b>
 		 </p>
 		</td>
 	</tr>
 </table>




</body>  
</html>