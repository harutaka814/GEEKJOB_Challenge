<%-- 
    Document   : JAVA_IF1
    Created on : 2018/01/23, 21:14:01
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
    int x=4;
    
    if(x==1){
        out.print("1です!");
    }
    else if(x==2){
        out.print("プログラミングキャンプ!");
    }
    else{
        out.print("その他です!");
    }


  %>          
        <h1></h1>
    </body>
</html>
