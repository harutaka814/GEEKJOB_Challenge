/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 晴嵩
 */
@WebServlet(name = "session2", urlPatterns = {"/session2"})
public class session2 extends HttpServlet {

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
            //リクエストパラメータを取得
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("name");
            String gender = request.getParameter("gender");
            String[] hobby = request.getParameterValues("hobby");
            
            //リクエストパラメータのチェック
            String errorMsg = "";
            String Hobby = "";
            List<String> x = new ArrayList<String>();
                    x.add("サッカー<br>");
                    x.add("野球<br>");
                    x.add("バスケ<br>");
                    x.add("カラオケ<br>");
                    x.add("スキー<br>");
                    x.add("スノボ<br>");
                    x.add("パソコン<br>");
                    x.add("ゲーム<br>");
            //nameのチェック
            if((name == null)||(name.length() == 0)){
                errorMsg += "名前が入力されていません<br>";
            }
            //genderのチェック
            String Gender = "";
            if((gender == null)||(gender.length() == 0)){
                errorMsg += "性別が選択されていません<br>";
            }else{
                if(gender.equals("0")){
                    Gender = "男性";
                }else if(gender.equals("1")){
                    Gender = "女性";
                }   
            }
            //hobbyのチェック
            if((hobby == null) || (hobby.length == 0)){
                errorMsg += "趣味の項目は最低一つはチェックを入れてください";
            }else{
                for(int i=0;i<hobby.length;i++){
                    Hobby += x.get(Integer.parseInt(hobby[i]));
                }
           }
        
            //セッションの登録
            HttpSession hs = request.getSession();
            hs.setAttribute("name",name);
            hs.setAttribute("gender",gender);
            hs.setAttribute("hobby",hobby);
            
            
            
            
            //リクエストパラメータの設定
            String msg = name + "さん(" + Gender + ") の趣味は<br>" + Hobby + "です";
            if(errorMsg.length() != 0){
                msg = errorMsg;
            }
            //リクエストパラメータの表示
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>フォーム送信結果</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>" + msg + "</p>");
            //out.println("<p>" + hobby + "</p>");
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
