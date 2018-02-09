<%-- 
    Document   : JAVA_LOOP3
    Created on : 2018/02/09, 15:47:47
    Author     : 晴嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
      int x=0;
      
      for(int i=1;i<=100;i++){
          
          x=x+i;
      };
        
      out.print("1から100までの和は"+x+"です");  
    %>
    
    
    <body>
        <h1></h1>
    </body>
</html>
