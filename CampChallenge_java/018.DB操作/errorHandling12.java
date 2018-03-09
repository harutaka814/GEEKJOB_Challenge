/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
@WebServlet(urlPatterns = {"/errorHandling12"})
public class errorHandling12 extends HttpServlet {

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
           
            //リクエストの取得
            request.setCharacterEncoding("UTF-8");
            String ID = request.getParameter("ID");
            String name = request.getParameter("name");
            String year = request.getParameter("year") ;
            String month = request.getParameter("month");
            String day = request.getParameter("day");
            String age = request.getParameter("age");
            String tel = request.getParameter("tel");
            
            //リクエストパラメータのチェック
            String errorMsg = "";
            if((ID == null) || (ID.length() == 0)){
                errorMsg += "IDが入力されていません<br>";
            }
            if((name == null) || (name.length() == 0)){
                errorMsg += "名前が入力されていません<br>";
            }
            if((year == null) || (year.length() == 0)){
                errorMsg += "生年月日が正しく入力されていません<br>";
            }else if((month == null) || (month.length() == 0)){
                errorMsg += "生年月日が正しく入力されていません<br>";
            }else if((day == null) || (day.length() == 0)){
                errorMsg += "生年月日が正しく入力されていません<br>";
            }
            if((age == null) || (age.length() == 0)){
                errorMsg += "年齢が入力されていません<br>";
            }
            if((tel == null) || (tel.length() == 0)){
                errorMsg += "電話番号が入力されていません<br>";
            }
            if(errorMsg.length() != 0){
                out.println(errorMsg);
            }else{
            //データベースへの接続
            Connection db_con = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                db_con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/GEEKJOB","root","");
                
                //SQL文の作成
                String sql = "INSERT INTO profiles VALUES("
                        + Integer.parseInt(ID) + ",\""
                        + name + "\",\""
                        + tel + "\","
                        + Integer.parseInt(age) + ",\""
                        + year + "-" + month + "-" + day + "\");";
                PreparedStatement db_st = db_con.prepareStatement(sql);
                db_st.executeUpdate();
               
                //複合検索　清もしくは田の文字が名前にある人のデータを抽出
                String sql2 = "SELECT * FROM profiles WHERE name LIKE \"%清%\""
                         + "OR name LIKE \"%田%\" ";
                PreparedStatement db_st2 = db_con.prepareStatement(sql2);
                ResultSet db_data = db_st2.executeQuery();
                
                out.println("\"清\"もしくは\"田\"が名前に含まれている人物のデータを抽出しました<br><br>");
                while(db_data.next()){
                    out.println("ID:" + db_data.getString("profilesID") + "<br>"
                        + "名前:" + db_data.getString("name") + "<br>"
                        + "電話番号:" + db_data.getString("tel") + "<br>"
                        + "年齢:" + db_data.getString("age") + "<br>"
                        + "生年月日:" + db_data.getString("birthday") + "<br><br>");
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
            }
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            //out.println("<title>Servlet errorHandling12</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet errorHandling12 at " + request.getContextPath() + "</h1>");
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
