<% 
	Cookie c1 = new Cookie("firstName", "abc");
	Cookie c2 = new Cookie("lastName","xyZ");
	response.addCookie(c1);
	response.addCookie(c2);
%>
	
	${cookie.firstName.value}</br>
	${cookie.lastName.value}
	
	
	
	
<!-- 'cookie' is an implict object in exp.language(cookie.name of cookie.value of cookie)-->
<!-- two cookies are storing in response and returned to browser -->
first time we didn't get out put, form 2d time we get otpur
	