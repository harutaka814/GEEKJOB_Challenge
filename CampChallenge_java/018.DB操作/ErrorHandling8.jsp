<%-- 
    Document   : ErrorHandling8
    Created on : 2018/03/06, 13:40:17
    Author     : 晴嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>errorHandling名前送信フォーム</title>
    </head>
    <body>
        <form action="/javaWebPractice2/errorHandling8" method="post">
            名前だけ送信フォーム<br>
            名前:<input type="text" name="name"><br>
            <input type="submit" value="送信">
        </form>    
    </body>
</html>
