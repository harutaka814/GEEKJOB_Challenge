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
@WebServlet(name = "errorHandling13Inv", urlPatterns = {"/errorHandling13Inv"})
public class errorHandling13Inv extends HttpServlet {

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
            String KindOfGoods = request.getParameter("KindOfGoods");
            String GoodsName = request.getParameter("GoodsName");
            String GoodsCount = request.getParameter("GoodsCount");
            
            //リクエストパラメータのチェック
            String errorMsg = "";
            if((KindOfGoods == null) || (KindOfGoods.length() == 0)){
                errorMsg += "商品の種類を選択してください<br>";
            }else if(KindOfGoods.equals("1")){
                KindOfGoods = "食品";
            }else if(KindOfGoods.equals("2")){
                KindOfGoods = "家電";
            }else if(KindOfGoods.equals("3")){
                KindOfGoods = "日用品";
            }
            if((GoodsName == null) || (GoodsName.length() == 0)){
                errorMsg += "商品の名前を入力してください";
            }
            if((GoodsCount == null) || (GoodsCount.length() == 0)){
                errorMsg += "商品の個数を選択してください";
            }
            //リクエストパラメータの表示設定
            if( errorMsg.length() != 0 ){
                out.println(errorMsg);
            }else{
                //登録商品検索
            //サーバーに接続
            Connection db_con = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                db_con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/GEEKJOB","root","");
                
                //同じ商品が登録されているか探す
                String sql = "SELECT * FROM InventoryControl WHERE "
                        + "GoodsName=\"" + GoodsName + "\";";
                PreparedStatement db_st = db_con.prepareStatement(sql);
                ResultSet db_data = db_st.executeQuery();
                
                if(db_data.next() == false){
                    //同じ商品が登録されていなければ新しくINSERT
                    //SQL文の作成
                String sql2 = "INSERT INTO InventoryControl VALUES("
                        + "\"" + KindOfGoods + "\",\""
                        + GoodsName + "\",\""
                        + Integer.parseInt(GoodsCount) + "\");";
                PreparedStatement db_st2 = db_con.prepareStatement(sql2);
                db_st2.executeUpdate();
                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>商品を登録しました</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<p>商品を登録しました</p>");
                out.println("</body>");
                out.println("</html>");
                }else{
                    //同じ商品があれば個数の部分だけUPDATE
                    int IntGoodsCount = Integer.parseInt(db_data.getString("GoodsCount") ) 
                            + Integer.parseInt(GoodsCount);
                    String sql3 = "UPDATE InventoryControl SET " 
                            +"GoodsCount=" + IntGoodsCount  
                            + " WHERE GoodsName=\"" + GoodsName + "\";" ;
                    PreparedStatement db_st3 = db_con.prepareStatement(sql3);
                    db_st3.executeUpdate();
                    
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>商品の個数を変更しました</title>");            
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<p>商品の個数を変更しました</p>");
                    out.println("</body>");
                    out.println("</html>");
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
