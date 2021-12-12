package control;//package control;
//
//import entity.*;
//import dao.*;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet(name = "EditAcControl", urlPatterns = {"/editac"})
//public class EditAcControl extends HttpServlet {
//
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//
//    }
//
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        request.setCharacterEncoding("UTF-8");
//
//
//
//
//        request.getRequestDispatcher("EditAccount.jsp").forward(request, response);
//    }
//
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        request.setCharacterEncoding("UTF-8");
//        //Bước 1: get data from jsp
//        String id = request.getParameter("id");
//        String user = request.getParameter("user"); //Get by name
//        String pass= request.getParameter("pass");
//        String isSell = request.getParameter("isSell");
//        String isAdmin = request.getParameter("isAdmin");
//
//        //Bước 2: set data to ProductDAO
//
//        DAO dao=new DAO();
//        dao.editAc(id,user,pass,isSell,isAdmin);
//        response.sendRedirect("accountManager");
//    }
//
//
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}