<%-- 
    Document   : JAVA_RENSOUHAIRETSU
    Created on : 2018/02/09, 14:59:23
    Author     : 晴嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%@ page import="java.util.*"%>
    <%
        HashMap<String,String>data1=new HashMap<String,String>(){
            {
                put("1","AAA");
                put("hello","world");
                put("soeda","33");
                put("20","20");
            }
        };
        
        out.print(data1);
        
    %>    
    
    <body>
        <h1></h1>
    </body>
</html>
