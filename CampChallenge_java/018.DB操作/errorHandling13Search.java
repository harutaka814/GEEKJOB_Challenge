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
/**
 *
 * @author 晴嵩
 */
@WebServlet(name = "errorHandling13Search", urlPatterns = {"/errorHandling13Search"})
public class errorHandling13Search extends HttpServlet {

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
            
            //登録商品検索
            //サーバーに接続
            Connection db_con = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                db_con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/GEEKJOB","root","");
                //sql文 全件表示の実行
                String sql = "SELECT * FROM InventoryControl";
                PreparedStatement db_st = db_con.prepareStatement(sql);
                ResultSet db_data = db_st.executeQuery();
                
                while(db_data.next()){
                    out.println("商品の種類:" + db_data.getString("KindOfGoods") + "<br>"
                        + "商品の名前:" + db_data.getString("GoodsName") + "<br>"
                        + "商品の個数:" + db_data.getString("GoodsCount") + "<br><br>");
                }
            }catch(SQLException e){
                    out.println(e.getMessage());
                }catch(ClassNotFoundException e){
                    out.println(e.getMessage());
                }finally{
                    try{
                        if(db_con != null){
                            db_con.close();
                        }
                    }catch(SQLException e){
                        out.println(e.getMessage());
                    }
                }
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
           //out.println("<title>Servlet errorHandling13Search</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet errorHandling13Search at " + request.getContextPath() + "</h1>");
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
