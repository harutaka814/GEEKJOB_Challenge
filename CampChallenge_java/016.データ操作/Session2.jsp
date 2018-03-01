<%-- 
    Document   : Session2
    Created on : 2018/03/01, 14:34:10
    Author     : 晴嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="java.util.*" %>

<!DOCTYPE html>
<html>
    <head>
        <title>フォーム作成テスト</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <%
            //前回フォームに入力した内容の取得
          HttpSession hs = request.getSession();
          //out.println(hs.getAttribute("name"));  
          //out.println((String)hs.getAttribute("gender"));
          String[] hobby = (String[]) hs.getAttribute("hobby");
          List<String> Hobby = new ArrayList<String>();
          for(int i=0;i<hobby.length;i++){
              Hobby.add(hobby[i]);
          }
          //out.println(Hobby.contains("0"));
          //if(Hobby.contains("0")){
              //out.println("checked=\"checked\"");
         // }
          
        %> 
        <form action="/javaWebPractice2/session2" method="post">
            名前を入力してください<br>
            <input type="text" name="name" value="" placeholder="<%= hs.getAttribute("name") %>"><br>
            性別を選択してください<br>
            男<input type="radio" name="gender" value="0"  
                    <% if(Integer.parseInt((String) hs.getAttribute("gender") ) == 0 ){out.print("checked=\"checked\"");}
                %> >
            女<input type="radio" name="gender" value="1"<% 
                if( Integer.parseInt((String)hs.getAttribute("gender") ) == 1 ){out.print("checked=\"checked\"");}
                %> ><br>
         
            趣味を選択してください(複数回答できます)<br>
            サッカー<input type="checkbox" name="hobby" value="0" 
               <% if(Hobby.contains("0")){
                    out.println("checked=\"checked\"");
                }     
                %> >
            野球<input type="checkbox" name="hobby" value="1"
                <% if(Hobby.contains("1")){
                    out.println("checked=\"checked\"");
                }     
                %> >
            バスケ<input type="checkbox" name="hobby" value="2"
                <% if(Hobby.contains("2")){
                    out.println("checked=\"checked\"");
                }     
                %> >
            カラオケ<input type="checkbox" name="hobby" value="3"
                <% if(Hobby.contains("3")){
                    out.println("checked=\"checked\"");
                }     
                %>><br>
            スキー<input type="checkbox" name="hobby" value="4"
                <% if(Hobby.contains("4")){
                    out.println("checked=\"checked\"");
                }     
                %>>
            スノボ<input type="checkbox" name="hobby" value="5"
                <% if(Hobby.contains("5")){
                    out.println("checked=\"checked\"");
                }     
                %>>
            パソコン<input type="checkbox" name="hobby" value="6"
                <% if(Hobby.contains("6")){
                    out.println("checked=\"checked\"");
                }     
                %>>
            ゲーム<input type="checkbox" name="hobby" value="7"
                <% if(Hobby.contains("7")){
                    out.println("checked=\"checked\"");
                }     
                %>><br>
            <input type="submit" value="送信" >
        </form>
        
        <br><br>
           
                
        <p></p>
    </body>
</html>
