/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 晴嵩
 */
@WebServlet(urlPatterns = {"/errorHandling3"})
public class errorHandling3 extends HttpServlet {

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
            
            //GEEKJOBデータベースへ接続
            
            Connection db_con = null;
            //例外が発生するかもしれない処理の記述
              try{
                //ドライバの読み込み
                Class.forName("com.mysql.jdbc.Driver");
                //データベースの接続
                db_con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/GEEKJOB","root","");
                //out.println("接続成功しました<br>");
                //SQL文の準備
                String sql = "SELECT * FROM profiles;";
                 //SQL文を実行する
                PreparedStatement db_st = db_con.prepareStatement(sql);
                ResultSet db_data = db_st.executeQuery();
                while(db_data.next()){
                    out.println("ID:" + db_data.getString("profilesID")+"<br>"
                    + "name:" + db_data.getString("name") + "<br>"
                    + "tel:" + db_data.getString("tel") + "<br>"
                    + "age" + db_data.getString("age") + "<br>"
                    + "birthday:" + db_data.getString("birthday") + "<br><br>");
                }
                
            }catch(ClassNotFoundException e){
                 //JDBCドライバが見つからない時の処理                
                //インスタンスの中身を表示
                out.println(e.getMessage());
                
            }catch(SQLException e){
                //接続やSQL処理の失敗時の処理
                //インスタンスの中身を表示
                out.println(e.getMessage());
            
            }finally{
                //接続成功、失敗時のどちらでも行いたい処理
                //データベースの切断
                if(db_con != null){
                    try{
                        db_con.close();
                    }catch(SQLException e){
                        //切断失敗時の処理
                        out.println(e.getMessage());
                    }
                }
            }
                      
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            //out.println("<title>Servlet errorHandling3</title>");            
            out.println("</head>");
            out.println("<body>");
           // out.println("<h1>Servlet errorHandling3 at " + request.getContextPath() + "</h1>");
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
