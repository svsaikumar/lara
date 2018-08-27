<jsp:useBean id="emp" class="com.lara.Employee"/>

<jsp:setProperty name="emp" property="firstName" value="ramu"/>
<jsp:setProperty name="emp" property="lastName" value="kiran"/>
<jsp:setProperty name="emp" property="age" value="22"/>






<%= emp.getFirstName() %> </br>
<%= emp.getLastName() %> </br>
<%= emp.getAge() %> </br>

<jsp:getProperty name="emp" property="firstName"/> </br> <%-- on 'emp' object  calling firstName() method and getting value  --%>
<jsp:getProperty name="emp" property="lastName"/> </br>
<jsp:getProperty name="emp" property="age"/> </br> 


<!-- automatically calling getter and setter methods  -->

