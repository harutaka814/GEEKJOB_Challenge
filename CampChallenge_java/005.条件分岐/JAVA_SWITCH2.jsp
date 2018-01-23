<%-- 
    Document   : JAVA_SWITCH2
    Created on : 2018/01/23, 21:36:21
    Author     : 晴嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%
    char a='あ';
    
    switch(a){
        
        case 'A':
        out.print("英語");
        break;
        
        case 'あ':
        out.print("日本語");
        break;    
                    
    }
    
    
    
    
    
%>    
        
        <h1></h1>
    </body>
</html>
