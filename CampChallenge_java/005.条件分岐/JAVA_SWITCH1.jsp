<%-- 
    Document   : JAVA_SWITCH1
    Created on : 2018/01/23, 21:34:42
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
    int x=3;
    
    switch(x){
            case 1:
                
                out.print("one");
                break;
                
            case 2:
            
                out.print("two");
                break;
                
            default:
                
                out.print("想定外");
                break;
                
    }
     
 %>        
        <h1></h1>
    </body>
</html>
