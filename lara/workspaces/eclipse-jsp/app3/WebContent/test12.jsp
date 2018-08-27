<jsp:useBean id="emp" class="com.lara.Employee"/>
<%
	emp.setFirstName("vijay");
	emp.setLastName("blr");
	emp.setAge(22);
%>




<jsp:getProperty name="emp"  property="firstName"/> </br>
<jsp:getProperty name="emp"  property="lastName"/> </br>
<jsp:getProperty name="emp"  property="age"/> </br> 


<!-- inside emp object, getp is used for fallig getters metjod and printing(on which object has to call) -->