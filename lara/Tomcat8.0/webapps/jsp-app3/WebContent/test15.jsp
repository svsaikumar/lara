<jsp:useBean id="e1"
			 class="com.lara.Employee"/>

<jsp:setProperty name="e1"
				 property="*"/>

<%= e1.getFirstName() %> </br>
<%= e1.getLastName() %> </br>
<%= e1.getAge() %> </br>
<jsp:getProperty name="e1"
				 property="firstName"/> </br>
<jsp:getProperty name="e1"
				 property="lastName"/> </br>
<jsp:getProperty name="e1"
				 property="age"/> </br> 

