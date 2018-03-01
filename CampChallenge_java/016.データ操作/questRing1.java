/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 晴嵩
 */
@WebServlet(urlPatterns = {"/questRing1"})
public class questRing1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            //localhost:8080/javaWebPractice2/questRing1?total=3428&count=2000&type=2
            //上記のクエストリンクを使用してリクエストを取得します。
            
            //リクエストの取得
            request.setCharacterEncoding("UTF-8");
            String total = request.getParameter("total");
            String count = request.getParameter("count");
            String type = request.getParameter("type");
            
            //リクエストパラメータのチェック
            //totalのチェック
            String errorMsg = "";
            if((total == null) || (total.length() == 0)){
                errorMsg += "totalの値が未設定です。<br>";
            }
            //countのチェック
            if((count == null) || (count.length() == 0)){
                errorMsg += "countの値が未設定です。<br>";
            }
            //typeのチェック
            List<String> Type = new ArrayList<String>(Arrays.asList("null","雑貨","生鮮食品","その他"));
            if((type == null) || (type.length() == 0)){
                errorMsg += "typeの値が未設定です。<br>";
            }else{
                
                type = Type.get(Integer.parseInt(type));
            }
            //ポイントの計算
            double point;
            int Total = Integer.parseInt(total);
            if(Total<3000){
                point = Total*0;   
            }else if((Total>3000) &&(Total<5000) ){
                point = Total*0.04;
            }else{
                point = Total*0.05;
            }
            point = (int)point;
            
            //リクエストの設定
            String msg = "";
            if(errorMsg.length() != 0){
                msg = errorMsg;
            }else if(point !=0){
                msg = "商品の種類は" + type + "です。" + 
                        "商品の単価は" + count + "で、総額は" +
                        total + "円になります。" +
                        point + "円分のポイントがたまりました";
            }else{
                msg = "商品の種類は" + type + "です。" + 
                        "商品の単価は" + count + "で、総額は" +
                        total + "円になります。";
            }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>クエストリング課題</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>" + msg + "</p>");
            //out.println("<p>" + x + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
