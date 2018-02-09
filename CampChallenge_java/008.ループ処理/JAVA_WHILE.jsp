<%-- 
    Document   : JAVA_WHILE
    Created on : 2018/02/09, 15:59:41
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
        int x=11000;
        int count=0;
        
        while(x>=100){
            
            x=x/2;
            count++;
        };
        
        out.print(count+"回目でxは"+x+"になる");
        
    %>
    
    
    <body>
        <h1></h1>
    </body>
</html>
