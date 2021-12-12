//package control;
//
//import dao.DAO;
//import entity.Account;
//import entity.Cart;
//import entity.Product;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.*;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//@WebServlet("/order")
//public class OrderControl extends HttpServlet {
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//
////        List<Product> list = new ArrayList<>();
////        DAO dao = new DAO();
////
////
////
////        response.sendRedirect("checkout.jsp");
////    }
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        HttpSession session = request.getSession();
////        List<Cart> list = (List<Cart>) session.getAttribute("cart");
////        Account a = (Account) session.getAttribute("acc");
////        DAO dao = new DAO();
////        for (Cart o : list) {
////            dao.addToCart(a.getId(), o.getPid(), o.getAmount());
////        }
////        session.removeAttribute("cart");
//        response.sendRedirect("checkout.jsp");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
package control;

import dao.DAO;
import entity.Account;
import entity.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet("/order")
public class OrderControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

//        List<Product> list = new ArrayList<>();
//        DAO dao = new DAO();
//
//
//
//        response.sendRedirect("checkout.jsp");
//    }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Cart> list = (List<Cart>) session.getAttribute("cart");
        if(session.getAttribute("acc")==null){

            request.setAttribute("mess", "Bạn hãy đăng nhập để mua sản phẩm");
            request.getRequestDispatcher("Login.jsp").forward(request, response);

        }else{

            Account a = (Account) session.getAttribute("acc");
            DAO dao = new DAO();
            for (Cart o : list) {
                dao.addToCart(a.getId(), o.getPid(), o.getAmount());
            }


            response.sendRedirect("checkout.jsp");
        }}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
