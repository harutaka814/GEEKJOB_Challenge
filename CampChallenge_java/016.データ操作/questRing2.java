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
@WebServlet(urlPatterns = {"/questRing2"})
public class questRing2 extends HttpServlet {

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
            //localhost:8080/javaWebPractice2/questRing2?number=100
            //リクエストの取得
            request.setCharacterEncoding("UTF-8");
            String number = request.getParameter("number");
            
            //リクエストパラメータのチェック
            String errorMsg = "";
            if( (number == null) || (number.length() == 0)){
                errorMsg += "numberの値が入力されていません";
            }
            
            //素因数分解のアルゴリズム
            //1桁の素数のみで分解する
            int Number = Integer.parseInt(number);
            List<Integer> quotient = new ArrayList<Integer>();
            int surplus = 0;
            while(true){
                if(Number%2 == 0){
                    Number = Number/2;
                    quotient.add(2);
                }else if(Number%3 == 0){
                    Number = Number/3;
                    quotient.add(3);
                }else if(Number%5 == 0){
                    Number = Number/5;
                    quotient.add(5);
                }else if(Number%7 == 0){
                    Number = Number/7;
                    quotient.add(7);
                }else{
                    if(Number == 1){
                       break; 
                    }else{
                    surplus = Number;
                    break;
                    }
                }     
            }
            
            //リクエスト表示の設定
            String msg = "";
            String quoMsg = "";
            for(int i=0;i<quotient.size();i++){
                if(i == (quotient.size() - 1)){
                    quoMsg += quotient.get(i);
                }else{
                    quoMsg += quotient.get(i) + "*";
                }
            }
            if(errorMsg.length() !=0){
                msg = errorMsg;
            }else if(quotient.size() == 0){
                msg = number + "は分解できませんでした";
            }else{
                if(surplus != 0){
                msg = "素因数分解の結果<br>" + number +"は" + quoMsg + "*" + 
                        surplus + "で構成されています";
                }else{
                     msg = "素因数分解の結果<br>" + number +"は" + quoMsg +
                             "で構成されています";
                }
            }
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>素因数分解</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>" + msg +"</p>" );
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
