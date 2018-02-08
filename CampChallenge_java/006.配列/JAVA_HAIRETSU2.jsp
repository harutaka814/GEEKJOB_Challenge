<%-- 
    Document   : JAVA_HAIRETSU
    Created on : 2018/02/08, 15:30:36
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
        out.print("<br>");
        
        data1.set(2,"33");
        out.print(data1);
        
    
    %> 
    
    <body>
        <h1></h1>
    </body>
</html>
