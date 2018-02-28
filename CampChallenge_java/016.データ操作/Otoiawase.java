/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

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
@WebServlet(name = "Otoiawase", urlPatterns = {"/Otoiawase"})
public class Otoiawase extends HttpServlet {

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
            
            //リクエストパラメータの取得
            request.setCharacterEncoding("UTF-8");
            String otoiawase = request.getParameter("otoiawase");
            String name = request.getParameter("name");
            String qtype = request.getParameter("qtype");
            //リクエストパラメータのチェック
            //お問い合わせtextareaのチェック
            String errorMsg = "";
            if((otoiawase == null) || (otoiawase.length() == 0)){
                errorMsg += "お問い合わせ内容が記入されていません<br>";
            }
            //nameのチェック
            if((name == null) || (name.length() == 0)){
                errorMsg += "お名前が記入されていません<br>";
            }
            //ドロップダウンリストqtypeのチェック
            if(qtype.equals("question")){
                qtype = "プログラミングについて";
            }else if(qtype.equals("geekjob")){
                qtype = "ギークジョブについて";
            }else if(qtype.equals("support")){
                qtype = "アフターサポートについて";
            }
            
            //リクエストパラメータの設定
            String msg;
            if(errorMsg.length() != 0){
                msg = errorMsg;
            }else{
                 msg = name + "さん<br>" + qtype +
                         "の質問ありがとうございます<br><br>" +
                         "以下の内容が送信されました<br><br>" + otoiawase;
            }
               
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>質問内容の送信</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>" + msg + "</p>");
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
