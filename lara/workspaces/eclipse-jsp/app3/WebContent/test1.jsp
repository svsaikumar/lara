<jsp:useBean id="p1" class="com.lara.Person" />

<%= p1.getHello() %>  </br>
<% 
	out.println(p1.getHello() + "<br>");	//printing return value of getHello() method
%>  

</br>




<!-- through use bean tag we can create an object to a specific class -->
<!-- that use bean tag id(p1)(reference) can be used thorugh out jsp where we need -->
<!-- p1 is acting as reference variable which is pointing to person object -->
<!-- by using useBean tag we can create an object to specific class -->