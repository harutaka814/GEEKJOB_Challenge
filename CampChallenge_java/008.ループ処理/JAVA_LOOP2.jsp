<%-- 
    Document   : JAVA_LOOP2
    Created on : 2018/02/09, 15:27:50
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
        String x="";
        
        for(int i=0;i<30;i++){
          
            x=x+"A";
            
        };
        out.println(x+"<br>");
        out.println("文字列の長さは"+x.length()+"です。");
    %>   
    
    <body>
        <h1></h1>
    </body>
</html>
