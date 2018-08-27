<%@ page import="java.util.Date" %>
<%@ page import="java.util.Arrays" %>
<!-- for importing any package inside jsp -->

Todays date: <%= new Date() %>  </br>
Array content <%= Arrays.toString(new int[]{9, 10, 50}) %>




<!-- there 3 directives in jsp 

1.page
2.include 
3.taglib
 here we are using 'page' directive for importing
-->