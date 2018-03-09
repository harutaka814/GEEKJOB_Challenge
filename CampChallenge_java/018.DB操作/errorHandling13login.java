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
import java.sql.*;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author 晴嵩
 */
@WebServlet(name = "errorHandling13login", urlPatterns = {"/errorHandling13login"})
public class errorHandling13login extends HttpServlet {

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
            
            //リクエストパラメータ(ID,password)の受け取り
            request.setCharacterEncoding("UTF-8");
            String ID = request.getParameter("ID");
            String Password = request.getParameter("password");
            
            //ID,passwordが一致したらログインページへ飛ぶ
            //一致しないならログイン失敗を表示
            String TrueID = "1111";
            String TruePassword = "2222";
            if( (TrueID.equals(ID)) && (TruePassword.equals(Password)) ){
                
                //ログインページのフォームに処理を移行する。
                RequestDispatcher dispatcher = request.getRequestDispatcher(
                    "/WEB-INF/jsp/ErrorHandling13Inv.jsp");
                dispatcher.forward(request, response);
                
                
            }else{
                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>ログインできません</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<p>IDまたはパスワードが違います</p>");
                out.println("</body>");
                out.println("</html>");
            }
            
           
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
