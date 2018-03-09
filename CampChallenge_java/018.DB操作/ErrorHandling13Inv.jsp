<%-- 
    Document   : ErrorHandling13Inv
    Created on : 2018/03/09, 11:27:36
    Author     : 晴嵩
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>在庫管理フォーム</title>
    </head>
    <body>
         <form action="/javaWebPractice2/errorHandling13Search" method="post">
                商品の一覧はこちらから<input type="submit" value="商品一覧"><br><br>
        </form>
        
        <form action="/javaWebPractice2/errorHandling13Inv" method="post">
            商品登録or商品個数更新フォーム<br><br>
            商品の種類:<select name="KindOfGoods"><br>
                <option value=""> - </option>
                <option value="1"> 食品 </option>
                <option value="2"> 家電 </option>
                <option value="3"> 日用品 </option>
                </select><br>
            商品の名前:<input type="text" name="GoodsName"><br>
            商品の個数:<select name="GoodsCount">
                <option value="">-</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">13</option>
                <option value="14">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>
                <option value="21">21</option>
                <option value="22">22</option>
                <option value="23">23</option>
                <option value="24">24</option>
                <option value="25">25</option>
                <option value="26">26</option>
                <option value="27">27</option>
                <option value="28">28</option>
                <option value="29">29</option>
                <option value="30">30</option>
                <option value="-1">-1</option>
                <option value="-2">-2</option>
                <option value="-3">-3</option>
                <option value="-4">-4</option>
                <option value="-5">-5</option>
                <option value="-6">-6</option>
                <option value="-7">-7</option>
                <option value="-8">-8</option>
                <option value="-9">-9</option>
                <option value="-10">-10</option>
                <option value="-11">-11</option>
                <option value="-12">-12</option>
                <option value="-13">-13</option>
                <option value="-14">-14</option>
                <option value="-15">-15</option>
                <option value="-16">-16</option>
                <option value="-17">-17</option>
                <option value="-18">-18</option>
                <option value="-19">-19</option>
                <option value="-20">-20</option>
                <option value="-21">-21</option>
                <option value="-22">-22</option>
                <option value="-23">-23</option>
                <option value="-24">-24</option>
                <option value="-25">-25</option>
                <option value="-26">-26</option>
                <option value="-27">-27</option>
                <option value="-28">-28</option>
                <option value="-29">-29</option>
                <option value="-30">-30</option>
            </select><br>
            <input type="submit" value="登録"><br>
        </form>
        
       
        
    </body>
</html>
