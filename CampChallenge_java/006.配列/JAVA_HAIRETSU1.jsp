<%-- 
    Document   : JAVA_HAIRETSU1
    Created on : 2018/02/08, 14:51:42
    Author     : 晴嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@ page import="java.util.ArrayList" %>
    <%
        ArrayList<String> data1=new ArrayList<String>(){
        
            {
            add("10");
            add("100");
            add("soeda");
            add("hayashi");
            add("-20");
            add("118");
            add("END");
        
        }
        };
        out.print(data1);
        

        
        
        
        
    %>    
    
    <body>
        <h1></h1>
    </body>
</html>
