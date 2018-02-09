<%-- 
    Document   : JAVA_loop1
    Created on : 2018/02/09, 15:17:22
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
        long x=1;
        
        for(int i=0;i<20;i++){
          
            x=x*8;
            
        };
        
        out.print(x);
        
    %>
    
    <body>
       <h1></h1>
    </body>
</html>
