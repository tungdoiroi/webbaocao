package control;


import dao.DAO;
import entity.Cart;
import entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "AddToCart", urlPatterns = {"/addtocart"})
public class AddToCart extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AddToCart</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddToCart at " + request.getContextPath() + "</h1>");
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
        HttpSession session = request.getSession();
        int pid = Integer.parseInt(request.getParameter("pid"));
        Cart c = new Cart(pid, 1);
        List<Cart> list = new ArrayList<>();
        if (session.getAttribute("cart") == null) {
            list.add(c);
        } else {
            list = (List<Cart>) session.getAttribute("cart");
            int check = 0;
            for (Cart o : list) {
                if (o.getPid() == pid) {
                    o.setAmount(o.getAmount() + 1);
                    check = 1;
                }
            }
            if (check == 0) {
                list.add(c);
            }
        }
        session.setAttribute("cart", list);
        List<Product> listP = new ArrayList<>();
        DAO dao = new DAO();

        int total = 0;
        for (Cart o : list) {
            Product p = dao.getProduct(o.getPid());//lay id sp
            p.setAmount(o.getAmount());
            listP.add(p);
            total += p.getAmount() * p.getPrice();

        }
        request.setAttribute("listP", listP);
        request.setAttribute("total", getPriceWithDot(total));
        request.setAttribute("vat", 0.02 * total);
        request.setAttribute("sum", 1.02 * total);
        request.getRequestDispatcher("Cart.jsp").forward(request, response);

    }
    public String getPriceWithDot(int price) {
        String priceDot = "" + price;
        int i = priceDot.length() - 3;
        while (i > 0) {
            priceDot = priceDot.substring(0, i) + "." + priceDot.substring(i, priceDot.length());
            i -= 3;
        }
        return priceDot;
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