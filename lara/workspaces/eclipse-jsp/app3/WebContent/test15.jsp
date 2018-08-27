<jsp:useBean id="e1" class="com.lara.Employee"/>

<jsp:setProperty name="e1" property="*"/><%-- every property of e1,has to populate automatically from request parameters --%>

<%= e1.getFirstName() %> </br>
<%= e1.getLastName() %> </br>
<%= e1.getAge() %> </br>




<jsp:getProperty name="e1" property="firstName"/> </br>
<jsp:getProperty name="e1" property="lastName"/> </br>
<jsp:getProperty name="e1" property="age"/> </br> 

<!--  it is reading values from the form(test14.jsp) -->
<!-- reading data from request object -->
<!-- all the properties are reading from request object -->