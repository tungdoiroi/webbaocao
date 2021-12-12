////package control;
////
////import dao.DAO;
//////import entity.Account;
////import entity.Account;
////import entity.Cart;
////import java.io.IOException;
////import java.io.PrintWriter;
////import java.util.List;
////import javax.servlet.ServletException;
////import javax.servlet.annotation.WebServlet;
////import javax.servlet.http.HttpServlet;
////import javax.servlet.http.HttpServletRequest;
////import javax.servlet.http.HttpServletResponse;
////import javax.servlet.http.HttpSession;
////
/////**
//// *
//// * @author pc
//// */
////@WebServlet(name = "CheckOutControl", urlPatterns = {"/checkout"})
////public class CheckOutControl extends HttpServlet {
////
////        /**
////         * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
////         * methods.
////         *
////         * @param request servlet request
////         * @param response servlet response
////         * @throws ServletException if a servlet-specific error occurs
////         * @throws IOException if an I/O error occurs
////         */
////        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
////                throws ServletException, IOException {
////                response.setContentType("text/html;charset=UTF-8");
////                try (PrintWriter out = response.getWriter()) {
////                        /* TODO output your page here. You may use following sample code. */
////                        out.println("<!DOCTYPE html>");
////                        out.println("<html>");
////                        out.println("<head>");
////                        out.println("<title>Servlet CheckOutControl</title>");
////                        out.println("</head>");
////                        out.println("<body>");
////                        out.println("<h1>Servlet CheckOutControl at " + request.getContextPath() + "</h1>");
////                        out.println("</body>");
////                        out.println("</html>");
////                }
////        }
////
////        // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
////        /**
////         * Handles the HTTP <code>GET</code> method.
////         *
////         * @param request servlet request
////         * @param response servlet response
////         * @throws ServletException if a servlet-specific error occurs
////         * @throws IOException if an I/O error occurs
////         */
////        @Override
////        protected void doGet(HttpServletRequest request, HttpServletResponse response)
////                throws ServletException, IOException {
////                HttpSession session = request.getSession();
////                List<Cart> list = (List<Cart>) session.getAttribute("cart");
////                Account a = (Account) session.getAttribute("acc");
////                DAO dao = new DAO();
////                for (Cart o : list) {
////                        dao.addToCart(a.getUid(), o.getPid(), o.getAmount());
////                }
////                session.removeAttribute("cart");
////                response.sendRedirect("home");
////        }
////
////        /**
////         * Handles the HTTP <code>POST</code> method.
////         *
////         * @param request servlet request
////         * @param response servlet response
////         * @throws ServletException if a servlet-specific error occurs
////         * @throws IOException if an I/O error occurs
////         */
////        @Override
////        protected void doPost(HttpServletRequest request, HttpServletResponse response)
////                throws ServletException, IOException {
////                processRequest(request, response);
////        }
////
////        /**
////         * Returns a short description of the servlet.
////         *
////         * @return a String containing servlet description
////         */
////        @Override
////        public String getServletInfo() {
////                return "Short description";
////        }// </editor-fold>
////
////}
package control;

import dao.DAO;
import entity.Cart;
import entity.Customer;
import entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/checkout")
public class CheckOutControl extends HttpServlet {
        //    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
//        String PROID= request.getParameter("1");
                String name = request.getParameter("name");
                String gioitinh = request.getParameter("gioitinh");
                String diachi = request.getParameter("diachi");
                String dienthoai = request.getParameter("dienthoai");
                String email = request.getParameter("email");
                String cmnd = request.getParameter("cmnd");
                DAO dao = new DAO();
                Customer a=dao.checkCustomerExist(cmnd);
                if(a == null){
                        //dc chekout
                        dao.checkout(name,gioitinh,diachi,dienthoai,email,cmnd);
                        response.sendRedirect("myorder");
                }else{
                        //day ve trang checkout.jsp
                        response.sendRedirect("checkout.jsp");
                }
        }





        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                DAO dao = new DAO();
                List<Product> listCart  =dao.getCart();
                int total = 0;
                List<Cart> list = new ArrayList<>();
                for (Cart o : list) {
                        Product p = dao.getProduct(o.getPid());//lay id sp
//                        p.setAmount(o.getAmount());

                        total += p.getAmount() * p.getPrice();

                }
                request.setAttribute("listP", listCart);
        request.setAttribute("total", total);
        request.setAttribute("vat", 0.02 * total);
        request.setAttribute("sum", 1.02 * total);
        request.getRequestDispatcher("checkout.jsp").forward(request, response);


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

