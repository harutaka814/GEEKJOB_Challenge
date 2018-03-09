<%-- 
    Document   : ErrorHandling13login
    Created on : 2018/03/09, 10:51:20
    Author     : 晴嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>在庫管理システムログインページ</title>
    </head>
    <body>
         <form action="/javaWebPractice2/errorHandling13login" method="post">
             ログインフォーム<br><br>
             IDを入力してください<br>
             ID:<input type="text" name="ID"><br>
             パワスワードを入力してください<br>
             PW:<input type="password" name="password"><br>
             <input type="submit" value="ログイン"><br>
             
             
             
         </form>    
    </body>
</html>
